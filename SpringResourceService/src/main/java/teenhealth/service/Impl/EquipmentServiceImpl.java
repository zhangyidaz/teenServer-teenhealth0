package teenhealth.service.Impl;

import teenhealth.mybatis.mapper.TEquipmentMapper;
import teenhealth.mybatis.po.TEquipment;
import teenhealth.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private TEquipmentMapper tEquipmentMapper;

    //查询所有设备信息
    @Override
    public List<TEquipment> listAllEquipment(){
        return tEquipmentMapper.selectAllEquipment();
    }

    //添加设备
    @Override
    public void addEquipment(TEquipment tEquipment){
        tEquipmentMapper.insertSelective(tEquipment);
    }

    //根据id查找设备信息
    @Override
    public TEquipment selectEquipment(String id){
        return tEquipmentMapper.selectById(id);
    }

    //修改设备信息
    @Override
    public void updateEquipment(TEquipment tEquipment){
        tEquipmentMapper.updateByPrimaryKeySelective(tEquipment);
    }

    //删除设备
    @Override
    public void deleteEquipment(String id){
        tEquipmentMapper.deleteById(id);
    }
}
