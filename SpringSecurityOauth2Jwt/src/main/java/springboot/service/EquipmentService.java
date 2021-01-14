package springboot.service;

import io.swagger.models.auth.In;
import springboot.mybatis.po.TEquipment;

import java.util.List;

public interface EquipmentService {
    //查询所有设备信息
    List<TEquipment>listAllEquipment();

    //添加设备
    Integer addEquipment(TEquipment tEquipment);

    //根据id查找设备信息
    TEquipment selectEquipment(String id);

    //修改设备信息
    Integer updateEquipment(TEquipment tEquipment);

    //删除设备
    Integer deleteEquipment(String id);
}
