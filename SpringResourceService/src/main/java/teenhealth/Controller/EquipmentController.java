package teenhealth.Controller;

import teenhealth.mybatis.po.TEquipment;
import teenhealth.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    //设备列表
    @RequestMapping("/equipmentList")
    public String Listequipments(Model model){
        List<TEquipment>tEquipments=equipmentService.listAllEquipment();
        model.addAttribute("equipments",tEquipments);
        return "equipmentList";
    }

    //跳转设备添加页面
    @GetMapping("/addEquipment")
    public String Addequipment(){
        return "add_equipment";
    }

    //设备添加页面
    @PostMapping("/addEquipment")
    public String AddEquipment(TEquipment tEquipment){
        equipmentService.addEquipment(tEquipment);
        return "redirect:/teacher/equipmentList";
    }

    //修改设备信息
    @GetMapping("/editEquipment/{id}")
    public String editEquipment(Model model, @PathVariable("id")String id){
        TEquipment tEquipment=equipmentService.selectEquipment(id);
        model.addAttribute("equipment",tEquipment);
        return "edit_equipment";
    }

    //修改设备信息
    @PostMapping("/editEquipment/{id}")
    public String saveEquipment(TEquipment tEquipment,@PathVariable("id")String id){
        tEquipment.setId(id);
        equipmentService.updateEquipment(tEquipment);
        return "redirect:/teacher/equipmentList";
    }

    //删除设备
    @RequestMapping("/deleteEquipment/{id}")
    public String deleteEquipment(@PathVariable("id")String id){
        equipmentService.deleteEquipment(id);
        return "redirect:/teacher/equipmentList";
    }
}
