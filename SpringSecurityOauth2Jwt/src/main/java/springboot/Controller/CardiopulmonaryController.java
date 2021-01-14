package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.TCardiopulmonaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/teacher")

public class CardiopulmonaryController {

    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;

    ///////////////////以下为新前端适配的代码/////////////////////////////

//    //所有学生心肺耐力测试数据页面
//    @RequestMapping("/cardiolist")
//    @ResponseBody
//    public CommonResult CardiopulmonaryList(Model model, @RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TCardiopulmonaryCustom>tCardiopulmonaryCustoms=tCardiopulmonaryService.ListCardiopulmonary();
//        PageInfo<TCardiopulmonaryCustom> pageInfo1=new PageInfo<TCardiopulmonaryCustom>(page.getResult());
//        //model.addAttribute("cardiolist",tCardiopulmonaryCustoms);
//        return CommonResult.success(pageInfo1);
//
//    }
//
//    //根据学生id查询某个学生心肺耐力测试记录
//    @GetMapping("/cardiopulmonary/{id}")
//    @ResponseBody
//    public CommonResult StudentCardiopulmonary(Model model, @PathVariable("id")String studentid,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TCardiopulmonaryCustom> tCardiopulmonaryCustoms=tCardiopulmonaryService.ListStudentCardio(studentid);
//        //model.addAttribute("studentCardio",tCardiopulmonaryCustoms);
//        PageInfo<TCardiopulmonaryCustom> pageInfo1=new PageInfo<TCardiopulmonaryCustom>(page.getResult());
//        return CommonResult.success(pageInfo1);
//    }
//
//    //根据心肺耐力测试记录id查询详细心肺耐力测试报告
//    @GetMapping("/cardiohistory/{id}")
//    @ResponseBody
//    public CommonResult StudentCardio(Model model,@PathVariable("id")String cardioid,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        TCardiopulmonary tCardiopulmonary=tCardiopulmonaryService.selectCarido(cardioid);
//        //model.addAttribute("Cardio",tCardiopulmonary);
//        PageInfo<TCardiopulmonary> pageInfo1=new PageInfo<TCardiopulmonary>(page.getResult());
//        return CommonResult.success(pageInfo1);
//    }
//
//    //查询所有学生心肺耐力处方
//    @RequestMapping("/cardioplanlist")
//    @ResponseBody
//    public CommonResult CardiopulmanaryPlanList(Model model,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TCardiopulPlanCustom> tCardiopulPlanCustoms=tCardiopulmonaryService.ListCardiopulmonaryPlan();
//        //model.addAttribute("CardiopulPlan",tCardiopulPlanCustoms);
//        PageInfo<TCardiopulPlanCustom> pageInfo1=new PageInfo<TCardiopulPlanCustom>(page.getResult());
//        return CommonResult.success(pageInfo1);
//    }
//
//    //根据studentId查询xx学生所有心肺耐力训练处方
//    @GetMapping("/studentcardioplan/{id}")
//    @ResponseBody
//    public CommonResult StudentCardioPlan(Model model,@PathVariable("id")String studentid,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        TCardiopulPlan tCardiopulPlan=tCardiopulmonaryService.StudentNewCardioPlan(studentid);
//        //判断当前处方是否过期
//        if (tCardiopulPlan.getIsEnable()==1) {
//            Integer weeks = tCardiopulmonaryService.PlanDays(studentid);
//            if (weeks > tCardiopulPlan.getExecycle()) {
//                tCardiopulPlan.setIsEnable(0);
//                tCardiopulPlan.setStudentId(studentid);
//                tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlan);
//            }
//        }
//        List<TCardiopulPlanCustom> studentCardiopulPlan=tCardiopulmonaryService.ListPlanHistory(studentid);
//        PageInfo<TCardiopulPlanCustom> pageInfo1=new PageInfo<TCardiopulPlanCustom>(page.getResult());
//        //model.addAttribute("studentPlan",studentCardiopulPlan);
//        return CommonResult.success(pageInfo1);
//    }
//
//    //根据处方id查询xx学生xx处方执行记录
//    @GetMapping("/executecardioplan/{id}")
//    @ResponseBody
//    public CommonResult StudentExecutePlan(Model model,@PathVariable("id")String id,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TCardiopulRecord>tCardiopulRecords=tCardiopulmonaryService.StudentCardiopulRecord(id);
//        //model.addAttribute("studentRecords",tCardiopulRecords);
//        PageInfo<TCardiopulRecord> pageInfo1=new PageInfo<TCardiopulRecord>(page.getResult());
//        return CommonResult.success(pageInfo1);
//    }


    ///////////////////以下为旧前端适配的代码/////////////////////////////

    //所有学生心肺耐力测试数据页面
    @RequestMapping("/cardiolist")
    public String CardiopulmonaryList(Model model){
        List<TCardiopulmonaryCustom>tCardiopulmonaryCustoms=tCardiopulmonaryService.ListCardiopulmonary();
        model.addAttribute("cardiolist",tCardiopulmonaryCustoms);
        return "cardiopulmonaryList";

    }

    //根据学生id查询某个学生心肺耐力测试记录
    @GetMapping("/cardiopulmonary/{id}")
    public String StudentCardiopulmonary(Model model, @PathVariable("id")String studentid){
        List<TCardiopulmonaryCustom> tCardiopulmonaryCustoms=tCardiopulmonaryService.ListStudentCardio(studentid);
        model.addAttribute("studentCardio",tCardiopulmonaryCustoms);
        return "studentCardiopulmonary";
    }

    //根据心肺耐力测试记录id查询详细心肺耐力测试报告
    @GetMapping("/cardiohistory/{id}")
    public String StudentCardio(Model model,@PathVariable("id")String cardioid){
        TCardiopulmonary tCardiopulmonary=tCardiopulmonaryService.selectCarido(cardioid);
        model.addAttribute("CardioReport",tCardiopulmonary);
        return "studentCardiopulReport";
    }

    //查询所有学生心肺耐力处方
    @RequestMapping("/cardioplanlist")
    public String CardiopulmanaryPlanList(Model model){
        List<TCardiopulPlanCustom> tCardiopulPlanCustoms=tCardiopulmonaryService.ListCardiopulmonaryPlan();
        model.addAttribute("CardiopulPlan",tCardiopulPlanCustoms);
        return "cardiopulmanaryPlanList";
    }

    //根据studentId查询xx学生所有心肺耐力训练处方
    @GetMapping("/studentcardioplan/{id}")
    public String StudentCardioPlan(Model model,@PathVariable("id")String studentid){
        TCardiopulPlan tCardiopulPlan=tCardiopulmonaryService.StudentNewCardioPlan(studentid);
        //判断当前处方是否过期
        if (tCardiopulPlan.getIsEnable()==1) {
            Integer weeks = tCardiopulmonaryService.PlanDays(studentid);
            if (weeks > tCardiopulPlan.getExecycle()) {
                tCardiopulPlan.setIsEnable(0);
                tCardiopulPlan.setStudentId(studentid);
                tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlan);
            }
        }
        List<TCardiopulPlanCustom> studentCardiopulPlan=tCardiopulmonaryService.ListPlanHistory(studentid);
        model.addAttribute("studentPlan",studentCardiopulPlan);
        return "studentCardiopulmanaryPlanHistory";
    }

    //根据处方id查询xx学生xx处方执行记录
    @GetMapping("/executecardioplan/{id}")
    public String StudentExecutePlan(Model model,@PathVariable("id")String id){
        List<TCardiopulRecord>tCardiopulRecords=tCardiopulmonaryService.StudentCardiopulRecord(id);
        model.addAttribute("studentRecords",tCardiopulRecords);
        return "studentCardioRecords";
    }
}
