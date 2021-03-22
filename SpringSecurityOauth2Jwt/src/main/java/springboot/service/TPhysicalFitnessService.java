package springboot.service;

import springboot.mybatis.po.TPhysicalFitness;
import springboot.mybatis.po.TPhysicalFitnessCustom1;

import java.util.List;

public interface TPhysicalFitnessService {

    //插入体适能设备检测数据
    Integer insertTest(TPhysicalFitness tPhysicalFitness);

    //查询所有学生体适能数据
    List<TPhysicalFitnessCustom1> ListALLPhysicalFitness();

    //根据studentId查询测试记录
    List<TPhysicalFitnessCustom1> ListPhysicalFitnessbyStudentId(String studentId);
}
