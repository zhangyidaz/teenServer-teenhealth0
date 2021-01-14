package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.TCardiopulmonaryService;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/teacher")

public class NewCardiopulmonaryController {

    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;

    ///////////////////以下为新前端适配的代码/////////////////////////////

    //所有学生心肺耐力测试数据页面
    @RequestMapping("/cardiolist1")
    @ResponseBody
    public CommonResult CardiopulmonaryList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulmonaryCustom>tCardiopulmonaryCustoms=tCardiopulmonaryService.ListCardiopulmonary();
        PageInfo<TCardiopulmonaryCustom> pageInfo1=new PageInfo<TCardiopulmonaryCustom>(page.getResult());
        //model.addAttribute("cardiolist",tCardiopulmonaryCustoms);
        return CommonResult.success(pageInfo1);

    }

    //根据学生id查询某个学生心肺耐力测试记录
    @PostMapping("/cardiopulmonary1/{studentId}")
    @ResponseBody
    public CommonResult StudentCardiopulmonary(@PathVariable("studentId")String studentid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulmonaryCustom> tCardiopulmonaryCustoms=tCardiopulmonaryService.ListStudentCardio(studentid);
        PageInfo<TCardiopulmonaryCustom> pageInfo1=new PageInfo<TCardiopulmonaryCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据心肺耐力测试记录id查询详细心肺耐力测试报告
    @PostMapping("/cardiohistory1/{id}")
    @ResponseBody
    public CommonResult StudentCardio(@PathVariable("id")String cardioid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        TCardiopulmonary tCardiopulmonary=tCardiopulmonaryService.selectCarido(cardioid);
        PageInfo<TCardiopulmonary> pageInfo1=new PageInfo<TCardiopulmonary>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    /*//根据心肺耐力测试记录id查询详细心肺耐力测试报告
    @GetMapping("/cardiohistory1/{id}")
    @ResponseBody
    public CommonResult StudentCardio(@PathVariable("id")String cardioid){
        TCardiopulmonary tCardiopulmonary=tCardiopulmonaryService.selectCarido(cardioid);
        return CommonResult.success(tCardiopulmonary);
    }
*/

    //查询所有学生心肺耐力处方
    @RequestMapping("/cardioplanlist1")
    @ResponseBody
    public CommonResult CardiopulmanaryPlanList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulPlanCustom> tCardiopulPlanCustoms=tCardiopulmonaryService.ListCardiopulmonaryPlan();
        PageInfo<TCardiopulPlanCustom> pageInfo1=new PageInfo<TCardiopulPlanCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据studentId查询xx学生所有心肺耐力训练处方
    @PostMapping("/studentcardioplan1/{studentId}")
    @ResponseBody
    public CommonResult StudentCardioPlan(@PathVariable("studentId")String studentid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulPlanCustom> studentCardiopulPlan=tCardiopulmonaryService.ListPlanHistory(studentid);
        PageInfo<TCardiopulPlanCustom> pageInfo1=new PageInfo<TCardiopulPlanCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //根据处方id查询xx学生xx处方执行记录
    @PostMapping("/executecardioplan1/{id}")
    @ResponseBody
    public CommonResult StudentExecutePlan(@PathVariable("id")String id,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulRecord>tCardiopulRecords=tCardiopulmonaryService.StudentCardiopulRecord(id);
        PageInfo<TCardiopulRecord> pageInfo1=new PageInfo<TCardiopulRecord>(page.getResult());
        return CommonResult.success(pageInfo1);
    }


}
