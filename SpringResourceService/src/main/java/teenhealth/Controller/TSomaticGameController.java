package teenhealth.Controller;

import teenhealth.mybatis.po.*;
import teenhealth.service.TSomaticGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import teenhealth.mybatis.po.TSomaticGameCustom;

import java.util.List;


@Controller
@RequestMapping("/teacher")
public class TSomaticGameController {
    @Autowired
    private TSomaticGameService tSomaticGameService;

    //所有学生心肺耐力测试数据页面
    @RequestMapping("/somaticgamelist")
    public String TSomaticGameList(Model model){
        List<TSomaticGameCustom> SomaticList=tSomaticGameService.ListTSomaticGame();
        model.addAttribute("SomaticList",SomaticList);
        return "somaticgameList";
    }

    //根据学生id查询某个学生体感游戏测试记录
    @GetMapping("/somaticgame/{id}")
    public String StudentSomatic(Model model,@PathVariable("id")String studentid){
        List<TSomaticGameCustom> tSomaticGameCustoms=tSomaticGameService.ListStudentSomatic(studentid);
        model.addAttribute("studentSomaticGame",tSomaticGameCustoms);
        return "studentSomaticgame";
    }

    //根据体感游戏测试记录id查询详细体感游戏测试报告
    @GetMapping("/somaticgamehistory/{id}")
    public String SomaticHistory(Model model,@PathVariable("id") String somaticid){
        TSomaticGame tSomaticGame=tSomaticGameService.selectStudentSomatioc(somaticid);
        model.addAttribute("tSomaticGame",tSomaticGame);
        return "";
    }

    //查询所有学生体感游戏处方
    @RequestMapping("/somaticplanlist")
    public String SomaticPlanList(Model model){
        List<TSomaticGamePlanCustom> tSomaticGamePlanCustom=tSomaticGameService.ListSomaticPlan();
        model.addAttribute("SomaticPlans",tSomaticGamePlanCustom);
        return "somaticPlanList";
    }

    //根据studentId查询xx学生的所有体感游戏训练处方
    @GetMapping("/studentplanhistory/{id}")
    public String StudentSomaticPlan(Model model,@PathVariable("id")String studentid){
        TSomaticGamePlan tSomaticGamePlan=tSomaticGameService.StudentNewSomaticPlan(studentid);
        if(tSomaticGamePlan.getIsEnable()==1){
            Integer weeks=tSomaticGameService.Plandays(studentid);
            if(weeks>tSomaticGamePlan.getExecycle()){
                tSomaticGamePlan.setIsEnable(0);
                tSomaticGamePlan.setStudentId(studentid);
                tSomaticGameService.UpdateStudentSomaticPlan(tSomaticGamePlan);
            }
        }
        List<TSomaticGamePlanCustom>tSomaticGamePlanCustoms=tSomaticGameService.ListStudentGamePlan(studentid);
        model.addAttribute("StudentSomaticPlans",tSomaticGamePlanCustoms);
        return "studentsomaticPlanHistory";
    }

    //根据处方id查询xx学生xx处方执行记录
    @GetMapping("/studentplanrecords/{id}")
    public String StudentPlanRecords(Model model,@PathVariable("id") String id){
        List<TSomaticGameRecord>tSomaticGameRecords=tSomaticGameService.ListSomaticPlanRecords(id);
        model.addAttribute("SomaticPlanRecords",tSomaticGameRecords);
        return "studentPlanRecords";
    }

}
