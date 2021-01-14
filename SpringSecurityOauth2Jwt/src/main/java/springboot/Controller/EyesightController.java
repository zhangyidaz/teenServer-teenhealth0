package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.CommonResult;
import springboot.mybatis.po.TEyesight;
import springboot.service.TEyesightService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/teacher")

public class EyesightController {
    @Autowired
    private TEyesightService tEyesightService;

    //在页面显示所有学生视力信息
    @GetMapping("/eyesightlist")
    @ResponseBody
    public CommonResult<TEyesight> EyesightList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TEyesight> ListEyesight=tEyesightService.ListEyesight();
        PageInfo<TEyesight> pageInfo1=new PageInfo<TEyesight>(page.getResult());
        return CommonResult.success(pageInfo1);
    }


}
