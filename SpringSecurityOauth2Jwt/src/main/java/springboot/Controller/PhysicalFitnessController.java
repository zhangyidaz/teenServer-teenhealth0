package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.mybatis.po.CommonResult;
import springboot.mybatis.po.TClassCustom;
import springboot.mybatis.po.TPhysicalFitnessCustom1;
import springboot.service.TPhysicalFitnessService;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class PhysicalFitnessController {
    @Autowired
    private TPhysicalFitnessService tPhysicalFitnessService;

    @RequestMapping("/physicalfitnessList")
    @ResponseBody
    public CommonResult PhysicalFitnessList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TPhysicalFitnessCustom1>tPhysicalFitnessCustom1=tPhysicalFitnessService.ListALLPhysicalFitness();
        PageInfo<TPhysicalFitnessCustom1>tPhysicalFitnessCustom1PageInfo=new PageInfo<TPhysicalFitnessCustom1>(page.getResult());
        return CommonResult.success(tPhysicalFitnessCustom1PageInfo);
    }
}
