package springboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mybatis.mapper.TPhysicalFitnessMapper;
import springboot.mybatis.po.TPhysicalFitness;
import springboot.mybatis.po.TPhysicalFitnessCustom1;
import springboot.service.TPhysicalFitnessService;

import java.util.List;

@Service
public class TPhysicalFitnessServiceImpl implements TPhysicalFitnessService {
    @Autowired
    private TPhysicalFitnessMapper tPhysicalFitnessMapper;

    //插入体适能设备检测数据
    @Override
    public Integer insertTest(TPhysicalFitness tPhysicalFitness){
        return tPhysicalFitnessMapper.insertSelective(tPhysicalFitness);
    }

    //查询所有学生体适能数据
    @Override
    public List<TPhysicalFitnessCustom1> ListALLPhysicalFitness(){
        return tPhysicalFitnessMapper.ListALLPhysicalFitness();
    }
}
