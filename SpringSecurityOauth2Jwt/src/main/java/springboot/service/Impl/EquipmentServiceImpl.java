package springboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mybatis.mapper.TEquipmentMapper;
import springboot.mybatis.po.TEquipment;
import springboot.service.EquipmentService;

import java.util.List;

@Service
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
    public Integer addEquipment(TEquipment tEquipment){
        return tEquipmentMapper.insertSelective(tEquipment);
    }

    //根据id查找设备信息
    @Override
    public TEquipment selectEquipment(String id){
        return tEquipmentMapper.selectById(id);
    }

    //修改设备信息
    @Override
    public Integer updateEquipment(TEquipment tEquipment){
        return tEquipmentMapper.updateByPrimaryKeySelective(tEquipment);
    }

    //删除设备
    @Override
    public Integer deleteEquipment(String id){
        return tEquipmentMapper.deleteById(id);
    }

    //设备号查重
    @Override
    public TEquipment selectEquipmentNO(String equipmentNo){
        return tEquipmentMapper.selectEquipmentNO(equipmentNo);
    }
}
