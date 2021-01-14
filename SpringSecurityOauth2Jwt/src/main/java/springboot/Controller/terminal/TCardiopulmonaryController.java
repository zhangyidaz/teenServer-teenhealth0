package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.mybatis.po.*;
import springboot.service.StudentService;
import springboot.service.TCardiopulmonaryService;

import java.util.Map;

@Controller
@RequestMapping("/tph/service")

public class TCardiopulmonaryController {
    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;
    @Autowired
    private StudentService studentService;

    //功率车上传测试数据
    @RequestMapping("/cycle/uploadtest")
    @ResponseBody
    public Msg insertCardio(@RequestBody TCardiopulmonary tCardiopulmonary) throws Exception {
        System.out.println(tCardiopulmonary);
        TStudent tStudent=studentService.selectBystudentId(tCardiopulmonary.getStudentId());
        if(tCardiopulmonary==null || tStudent==null){
            return Msg.fail();
        }else {
            tCardiopulmonaryService.insertSelective(tCardiopulmonary);
            return Msg.success();
        }
    }

    //上传测试数据并生成处方功率车训练处方
    @RequestMapping("/cycle/uploadtestAndPlan")
    @ResponseBody
    public Msg insertCardioPlan(@RequestBody TCardiopulmonary tCardiopulmonary) throws Exception {
        System.out.println(tCardiopulmonary);
        String studentId=tCardiopulmonary.getStudentId();
        TStudent tStudent=studentService.selectBystudentId(studentId);
        if(tCardiopulmonary==null || tStudent==null){   //判断
            return Msg.fail();
        }else {
            tCardiopulmonaryService.insertSelective(tCardiopulmonary);  //插入心肺耐力测试报告
            double fc=tCardiopulmonary.getFc();
            //System.out.println(tStudent);
            TCardiopulPlan tCardiopulPlan = tCardiopulmonaryService.StudentNewCardioPlan(studentId);    //获取最新心肺耐力处方
            //根据处方判断是否生成新处方
            if(tCardiopulPlan!=null){   //判断当前用户处方是否为空
                if (tCardiopulPlan.getIsEnable()==1) {  //判断用户当前处方是否可用
                    Integer weeks = tCardiopulmonaryService.PlanDays(studentId);
                    if (weeks==null||weeks > tCardiopulPlan.getExecycle()) { //判断处方是否过期
                        tCardiopulPlan.setIsEnable(0);
                        tCardiopulPlan.setStudentId(studentId);
                        tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlan);
                        TCardiopulPlan tCardiopulPlanNew=MakePlan(studentId,tStudent,fc);
                        tCardiopulmonaryService.insertCardiopulPlan(tCardiopulPlanNew);
                        return Msg.success();
                    }else { //当前有处方
                        return Msg.fail();
                    }
                }else { //
                    TCardiopulPlan tCardiopulPlanNew=MakePlan(studentId,tStudent,fc);
                    tCardiopulmonaryService.insertCardiopulPlan(tCardiopulPlanNew);
                    return Msg.success();
                }
            }else {
                TCardiopulPlan tCardiopulPlanNew=MakePlan(studentId,tStudent,fc);
                tCardiopulmonaryService.insertCardiopulPlan(tCardiopulPlanNew);
                return Msg.success();
            }
        }
    }

//    上传测试数据并更新处方，将原来处方置为不可用
    @RequestMapping("/cycle/updatePlan")
    @ResponseBody
    public Msg UpdateCardiopulPlan(@RequestBody TCardiopulmonary tCardiopulmonary){
        String studentId=tCardiopulmonary.getStudentId();
        double fc=tCardiopulmonary.getFc();
        TStudentCustom tStudent=studentService.selectBystudentId(studentId);
        tCardiopulmonaryService.insertSelective(tCardiopulmonary);  //插入心肺耐力测试报告
        TCardiopulPlan tCardiopulPlan = tCardiopulmonaryService.StudentNewCardioPlan(studentId); //获取最新心肺耐力处方
        tCardiopulPlan.setIsEnable(0);
        tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlan);
        TCardiopulPlan tCardiopulPlan1=MakePlan(studentId,tStudent,fc);
        tCardiopulmonaryService.insertCardiopulPlan(tCardiopulPlan1);
        return Msg.success();
    }

//    训练处方生成逻辑
    public TCardiopulPlan MakePlan(String studentId, TStudent tStudent,double fc){
        TCardiopulPlan tCardiopulPlan=new TCardiopulPlan();
        tCardiopulPlan.setStudentId(studentId);
        tCardiopulPlan.setIsEnable(1);
        if (tStudent.getSex()==1){  //男生
            if (fc<4.6){
                tCardiopulPlan.setExemode(0);
            }else if (fc>=4.6&&fc<6.4){
                tCardiopulPlan.setExemode(1);
            }else if (fc>=6.4&&fc<8.7){
                tCardiopulPlan.setExemode(2);
            }else if (fc>=8.7&&fc<11.6){
                tCardiopulPlan.setExemode(3);
            }else{
                tCardiopulPlan.setExemode(4);
            }
        }else{  //女生
            if (fc<3.7){
                tCardiopulPlan.setExemode(0);
            }else if (fc>=3.7&&fc<5.0){
                tCardiopulPlan.setExemode(1);
            }else if (fc>=5.0&&fc<6.7){
                tCardiopulPlan.setExemode(2);
            }else if (fc>=6.7&&fc<9.9){
                tCardiopulPlan.setExemode(3);
            }else{
                tCardiopulPlan.setExemode(4);
            }
        }
        tCardiopulPlan.setExecycle(4);  //设置训练周期
        tCardiopulPlan.setExefreq(2);   //设置训练频率
        return tCardiopulPlan;
    }

        //获取最新训练处方
        @RequestMapping("/cycle/CardiopulPlan")
        @ResponseBody
        public Msg getCardiopulPlan(@RequestBody Map<String,String> requestMap)throws Exception{
            String studentId=requestMap.get("studentId");
            TCardiopulPlan tCardiopulPlan = tCardiopulmonaryService.StudentNewCardioPlan(studentId);    //获取最新心肺耐力处方
            //判断处方是否过期
            Integer weeks = tCardiopulmonaryService.PlanDays(studentId);
            if (tCardiopulPlan==null){
                return Msg.fail();
            }else if (weeks > tCardiopulPlan.getExecycle()) {
                tCardiopulPlan.setIsEnable(0);
                tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlan);
                return Msg.fail();
            }else {
                return Msg.success(tCardiopulPlan);
            }
        }

    //插入处方训练记录
    @RequestMapping("/cycle/planrecord")
    @ResponseBody
    public Msg CardioPlanRecord(@RequestBody TCardiopulRecord tCardiopulRecord)throws Exception{
        tCardiopulmonaryService.insertCardioRecord(tCardiopulRecord);
        return Msg.success();
    }
}
