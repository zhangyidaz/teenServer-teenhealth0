package teenhealth.Controller;

import teenhealth.mybatis.po.*;
import teenhealth.service.StudentService;
import teenhealth.service.TCardiopulmonaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")

public class CardiopulmonaryController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;

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
        model.addAttribute("Cardio",tCardiopulmonary);
        return "";
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
        return "cardiopulmanaryPlanHistory";
    }

    //根据处方id查询xx学生xx处方执行记录
    @GetMapping("/executecardioplan/{id}")
    public String StudentExecutePlan(Model model,@PathVariable("id")String id){
        List<TCardiopulRecord>tCardiopulRecords=tCardiopulmonaryService.StudentCardiopulRecord(id);
        model.addAttribute("studentRecords",tCardiopulRecords);
        return "studentCardioRecords";
    }

}
