package teenhealth.service;

import teenhealth.mybatis.po.TEquipment;

import java.util.List;

public interface EquipmentService {
    //查询所有设备信息
    List<TEquipment>listAllEquipment();

    //添加设备
    void addEquipment(TEquipment tEquipment);

    //根据id查找设备信息
    TEquipment selectEquipment(String id);

    //修改设备信息
    void updateEquipment(TEquipment tEquipment);

    //删除设备
    void deleteEquipment(String id);
}
