package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.CommonResult;
import springboot.mybatis.po.TEquipment;
import springboot.service.EquipmentService;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class NewEquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    ///////////////////以下为新前端适配的代码/////////////////////////////

    //设备列表
    @RequestMapping("/equipmentList1")
    @ResponseBody
    public CommonResult Listequipments(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TEquipment>tEquipments=equipmentService.listAllEquipment();
        PageInfo<TEquipment> pageInfo1=new PageInfo<TEquipment>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //设备添加
    @PostMapping("/addEquipment1")
    @ResponseBody
    public CommonResult AddEquipment(@RequestBody TEquipment tEquipment){
        if (equipmentService.addEquipment(tEquipment)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //获取设备信息
    @GetMapping("/editEquipment1/{id}")
    @ResponseBody
    public CommonResult editEquipment(@PathVariable("id")String id){
        TEquipment tEquipment=equipmentService.selectEquipment(id);
        return CommonResult.success(tEquipment);
    }

    //修改设备信息
    @PostMapping("/editEquipment1/{id}")
    @ResponseBody
    public CommonResult saveEquipment(@RequestBody TEquipment tEquipment,@PathVariable("id")String id){
        tEquipment.setId(id);
        Integer a=equipmentService.updateEquipment(tEquipment);
        if(a==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //删除设备
    @RequestMapping("/deleteEquipment1/{id}")
    @ResponseBody
    public CommonResult deleteEquipment(@PathVariable("id")String id){
        if (equipmentService.deleteEquipment(id)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //设备号查重
    @GetMapping("/selectEquipmentNO/{equipmentNo}")
    @ResponseBody
    public CommonResult selectEquipmentNO(@PathVariable("equipmentNo")String equipmentNo){
        TEquipment tEquipment=equipmentService.selectEquipmentNO(equipmentNo);
        if(tEquipment!=null){
            return CommonResult.fail();
        }else {
            return CommonResult.success();
        }
    }

}
