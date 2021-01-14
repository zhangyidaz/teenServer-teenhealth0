package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.TSomaticGameService;

import java.util.List;


@Controller
@RequestMapping("/teacher")
public class NewSomaticGameController {
    @Autowired
    private TSomaticGameService tSomaticGameService;

    //所有学生体能要素测试数据页面
    @RequestMapping("/somaticgamelist1")
    @ResponseBody
    public CommonResult TSomaticGameList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TSomaticGameCustom> SomaticList=tSomaticGameService.ListTSomaticGame();
        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据学生id查询某个学生体感游戏测试记录
    @PostMapping("/somaticgame1/{studentId}")
    @ResponseBody
    public CommonResult StudentSomatic(@PathVariable("studentId")String studentid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TSomaticGameCustom> tSomaticGameCustoms=tSomaticGameService.ListStudentSomatic(studentid);
        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据体感游戏测试记录id查询详细体感游戏测试报告
    @PostMapping("/somaticgamehistory1/{id}")
    @ResponseBody
    public CommonResult SomaticHistory(@PathVariable("id") String somaticid){
        TSomaticGame tSomaticGame=tSomaticGameService.selectStudentSomatioc(somaticid);
        return CommonResult.success(tSomaticGame);
    }

    //查询所有学生体感游戏处方
    @RequestMapping("/somaticplanlist1")
    @ResponseBody
    public CommonResult SomaticPlanList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TSomaticGamePlanCustom> tSomaticGamePlanCustom=tSomaticGameService.ListSomaticPlan();
        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据studentId查询xx学生的所有体感游戏训练处方
    @PostMapping("/studentplanhistory1/{studentId}")
    @ResponseBody
    public CommonResult StudentSomaticPlan(@PathVariable("studentId")String studentid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TSomaticGamePlanCustom>tSomaticGamePlanCustoms=tSomaticGameService.ListStudentGamePlan(studentid);
        PageInfo<TSomaticGameCustom> pageInfo1=new PageInfo<TSomaticGameCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据处方id查询xx学生xx处方执行记录
    @PostMapping("/studentplanrecords1/{id}")
    @ResponseBody
    public CommonResult StudentPlanRecords(@PathVariable("id") String id,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TSomaticGameRecord>tSomaticGameRecords=tSomaticGameService.ListSomaticPlanRecords(id);
        PageInfo<TSomaticGameRecord> pageInfo1=new PageInfo<TSomaticGameRecord>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

}
