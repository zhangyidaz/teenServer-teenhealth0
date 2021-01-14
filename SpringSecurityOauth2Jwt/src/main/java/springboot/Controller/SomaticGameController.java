package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.TSomaticGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/teacher")
public class SomaticGameController {
    @Autowired
    private TSomaticGameService tSomaticGameService;

    ///////////////////以下为新前端适配的代码/////////////////////////////

//    //所有学生体能要素测试数据页面
//    @RequestMapping("/somaticgamelist")
//    public CommonResult TSomaticGameList(Model model, @RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TSomaticGameCustom> SomaticList=tSomaticGameService.ListTSomaticGame();
//        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
////        model.addAttribute("SomaticList",SomaticList);
////        return "somaticgameList";
//        return CommonResult.success(pageInfo1);
//    }
//
//    //根据学生id查询某个学生体感游戏测试记录
//    @PostMapping("/somaticgame/{id}")
//    public CommonResult StudentSomatic(Model model,@PathVariable("id")String studentid,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TSomaticGameCustom> tSomaticGameCustoms=tSomaticGameService.ListStudentSomatic(studentid);
//        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
////        model.addAttribute("studentSomaticGame",tSomaticGameCustoms);
////        return "studentSomaticgame";
//        return CommonResult.success(pageInfo1);
//    }
//
//    //根据体感游戏测试记录id查询详细体感游戏测试报告
//    @GetMapping("/somaticgamehistory/{id}")
//    public String SomaticHistory(Model model,@PathVariable("id") String somaticid){
//        TSomaticGame tSomaticGame=tSomaticGameService.selectStudentSomatioc(somaticid);
//        model.addAttribute("tSomaticGame",tSomaticGame);
//        return "";
//    }
//
//    //查询所有学生体感游戏处方
//    @RequestMapping("/somaticplanlist")
//    public CommonResult SomaticPlanList(Model model,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TSomaticGamePlanCustom> tSomaticGamePlanCustom=tSomaticGameService.ListSomaticPlan();
//        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
//        return CommonResult.success(pageInfo1);
////        model.addAttribute("SomaticPlans",tSomaticGamePlanCustom);
////        return "somaticPlanList";
//    }
//
//    //根据studentId查询xx学生的所有体感游戏训练处方
//    @PostMapping("/studentplanhistory/{id}")
//    public CommonResult StudentSomaticPlan(Model model,@PathVariable("id")String studentid,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        TSomaticGamePlan tSomaticGamePlan=tSomaticGameService.StudentNewSomaticPlan(studentid);
//        if(tSomaticGamePlan.getIsEnable()==1){
//            Integer weeks=tSomaticGameService.Plandays(studentid);
//            if(weeks>tSomaticGamePlan.getExecycle()){
//                tSomaticGamePlan.setIsEnable(0);
//                tSomaticGamePlan.setStudentId(studentid);
//                tSomaticGameService.UpdateStudentSomaticPlan(tSomaticGamePlan);
//            }
//        }
//        List<TSomaticGamePlanCustom>tSomaticGamePlanCustoms=tSomaticGameService.ListStudentGamePlan(studentid);
//        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
//        return CommonResult.success(pageInfo1);
////        model.addAttribute("StudentSomaticPlans",tSomaticGamePlanCustoms);
////        return "studentsomaticPlanHistory";
//    }
//
//    //根据处方id查询xx学生xx处方执行记录
//    @PostMapping("/studentplanrecords/{id}")
//    public CommonResult StudentPlanRecords(Model model,@PathVariable("id") String id,@RequestBody PageInfo pageInfo){
//        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<TSomaticGameRecord>tSomaticGameRecords=tSomaticGameService.ListSomaticPlanRecords(id);
//        PageInfo<TSomaticGameRecord> pageInfo1=new PageInfo<TSomaticGameRecord>(page.getResult());
//        return CommonResult.success(pageInfo1);
////        model.addAttribute("SomaticPlanRecords",tSomaticGameRecords);
////        return "studentPlanRecords";
//    }


    ///////////////////以下为旧前端适配的代码/////////////////////////////
    //所有学生体能要素测试数据页面
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
        return "studentSomaticgameReport";
    }

    //查询所有学生体感游戏处方
    @RequestMapping("/somaticplanlist")
    public String SomaticPlanList(Model model){

        List<TSomaticGamePlanCustom> tSomaticGamePlanCustom=tSomaticGameService.ListSomaticPlan();
        model.addAttribute("SomaticPlans",tSomaticGamePlanCustom);
        return "somaticPlanList";
    }

    //根据studentId查询xx学生的所有体感游戏训练处方
    @RequestMapping("/studentplanhistory/{id}")
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
    @RequestMapping("/studentplanrecords/{id}")
    public String StudentPlanRecords(Model model,@PathVariable("id") String id){
        List<TSomaticGameRecord>tSomaticGameRecords=tSomaticGameService.ListSomaticPlanRecords(id);
        model.addAttribute("SomaticPlanRecords",tSomaticGameRecords);
        return "studentPlanRecords";
    }



}
