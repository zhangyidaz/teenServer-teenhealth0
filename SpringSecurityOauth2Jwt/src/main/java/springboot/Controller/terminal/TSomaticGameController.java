package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.StudentService;
import springboot.service.TSomaticGameService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/tph/service")
public class TSomaticGameController {
    @Autowired
    private TSomaticGameService tSomaticGameService;
    @Autowired
    private StudentService studentService;

    //上传体感游戏测试数据
    @RequestMapping("/bodyfeel/uploadtest")
    public Msg insertSomaticTest(@RequestBody TSomaticGame tSomaticGame) throws Exception{
        System.out.println(tSomaticGame);
        TStudent tStudent=studentService.selectBystudentId(tSomaticGame.getStudentId());  //查询学生信息
        if(tSomaticGame==null & tStudent==null){
            return Msg.fail();
        }else {
            tSomaticGameService.inserttSomaticGametest(tSomaticGame);
            return Msg.success();
        }
    }

    //上传体感游戏测试数据并生成体感训练处方
    @RequestMapping("/bodyfeel/uploadtestAndPlan")
    public Msg insertSomaticTestAndPlan(@RequestBody TSomaticGame tSomaticGame)throws Exception{
        TStudent tStudent = studentService.selectBystudentId(tSomaticGame.getStudentId());  //查询学生信息
        String studentId=tStudent.getId();
        //学生是否存在，测试数据是否为空
        if(tSomaticGame==null & tStudent==null){
            return Msg.fail();
        }else if (tSomaticGame.getResultBlan()==0&tSomaticGame.getResultChoosetime()==0&
                tSomaticGame.getResultJump()==0&tSomaticGame.getResultFlex()==0){   //判断测试成绩是否有无效数据
            return Msg.fail1();
        }else {
            tSomaticGameService.inserttSomaticGametest(tSomaticGame);   //插入测试数据
            Integer score=tSomaticGame.getScoreBlan()+tSomaticGame.getScoreChoosetime()+tSomaticGame.getScoreFlex()+tSomaticGame.getScoreJump();
            //先查找有无最新训练计划
            TSomaticGamePlan tSomaticGamePlan =tSomaticGameService.StudentNewSomaticPlan(studentId);
            //若没有训练计划或者当前不可用则生成处方
            if (tSomaticGamePlan!=null){
                if (tSomaticGamePlan.getIsEnable()==1){
                    Integer weeks = tSomaticGameService.PlanDays(studentId);
                    if(weeks==null||weeks>tSomaticGamePlan.getExecycle()){   //判断处方是否过期
                        tSomaticGamePlan.setIsEnable(0);
                        tSomaticGamePlan.setStudentId(studentId);
                        tSomaticGameService.UpdateStudentSomaticPlan(tSomaticGamePlan); //将原处方至为不可用
                        TSomaticGamePlan tSomaticGamePlanNew=MakePlan(studentId,tStudent,score);    //新建处方
                        tSomaticGameService.inserttSomaticGamePlan(tSomaticGamePlanNew);    //插入处方
                        TSomaticGamePlan tSomaticGamePlan1 =tSomaticGameService.StudentNewSomaticPlan(studentId);
                        return Msg.success(tSomaticGamePlan1);
                    }else {
                        return Msg.fail();
                    }
                }else {
                    TSomaticGamePlan tSomaticGamePlan0=MakePlan(studentId,tStudent,score);    //新建处方
                    tSomaticGamePlan0.setStudentId(studentId);
                    tSomaticGameService.inserttSomaticGamePlan(tSomaticGamePlan0);    //插入处方
                    return Msg.success(tSomaticGamePlan0);
                }
            }else {
                TSomaticGamePlan tSomaticGamePlan1=MakePlan(studentId,tStudent,score);    //新建处方
                tSomaticGamePlan1.setStudentId(studentId);
                tSomaticGameService.inserttSomaticGamePlan(tSomaticGamePlan1);    //插入处方
                return Msg.success(tSomaticGamePlan1);
            }
        }
    }
    //处方生成逻辑
    public TSomaticGamePlan MakePlan(String studentId,TStudent tStudent,Integer score){
        TSomaticGamePlan tSomaticGamePlan=new TSomaticGamePlan();
        tSomaticGamePlan.setStudentId(studentId);
        tSomaticGamePlan.setIsEnable(1);    //设置处方可用
        tSomaticGamePlan.setExemode(3);     //设置训练模式
        tSomaticGamePlan.setExecycle(4);    //设置训练周期
        tSomaticGamePlan.setExefreq(2);     //设置训练频率
        if (tStudent.getSex()==1){  //男生
            if (score>=4&score<8){
                tSomaticGamePlan.setExediff(0);
                tSomaticGamePlan.setExedue(2);
            }else if (score>=8&score<12){
                tSomaticGamePlan.setExediff(1);
                tSomaticGamePlan.setExedue(3);
            }else if (score>=12&score<16){
                tSomaticGamePlan.setExediff(2);
                tSomaticGamePlan.setExedue(3);
            }else{
                tSomaticGamePlan.setExediff(2);
                tSomaticGamePlan.setExedue(5);
            }
        }else{  //女生
            if (score>=4&score<8){
                tSomaticGamePlan.setExediff(0);
                tSomaticGamePlan.setExedue(2);
            }else if (score>=8&score<12){
                tSomaticGamePlan.setExediff(1);
                tSomaticGamePlan.setExedue(2);
            }else if (score>=12&score<16){
                tSomaticGamePlan.setExediff(2);
                tSomaticGamePlan.setExedue(3);
            }else{
                tSomaticGamePlan.setExediff(2);
                tSomaticGamePlan.setExedue(4);
            }
        }
        return tSomaticGamePlan;
    }

    //体感游戏获取最新训练处方
    @PostMapping("/bodyfeel/SomaticPlan")
    @ResponseBody
    public Msg getSomaticPlan(@RequestBody Map<String, String> requestMap ){
        String studentId=requestMap.get("studentId");
        TSomaticGamePlan tSomaticGamePlan=tSomaticGameService.StudentNewSomaticPlan(studentId);
        if (tSomaticGamePlan==null){
            return Msg.fail();
        }else {
            return Msg.success(tSomaticGamePlan);
        }
    }

//    //体感游戏获取最新训练处方
//    @GetMapping("/bodyfeel/SomaticPlan/{id}")
//    @ResponseBody
//    public Msg getSomaticPlan(@PathVariable("id") String id){
//        TSomaticGamePlan tSomaticGamePlan=tSomaticGameService.StudentNewSomaticPlan(id);
//        if (tSomaticGamePlan==null){
//            return Msg.fail();
//        }else {
//            return Msg.success(tSomaticGamePlan);
//        }
//    }

    //插入体感游戏训练记录
    @RequestMapping("/bodyfeel/planrecord")
    @ResponseBody
    public Msg SomaticPlanRecord(@RequestBody TSomaticGameRecord tSomaticGameRecord){
        if(tSomaticGameService.insertSomaticGameRecord(tSomaticGameRecord)==1){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

}
