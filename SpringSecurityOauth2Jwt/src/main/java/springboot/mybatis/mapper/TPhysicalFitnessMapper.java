package springboot.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.mybatis.po.TPhysicalFitness ;
import springboot.mybatis.po.TPhysicalFitnessCustom1;
import springboot.mybatis.po.TPhysicalFitnessExample;

public interface TPhysicalFitnessMapper {
    long countByExample(TPhysicalFitnessExample example);

    int deleteByExample(TPhysicalFitnessExample example);

    int deleteByPrimaryKey(String id);

    int insert(TPhysicalFitness record);

    int insertSelective(TPhysicalFitness record);

    List<TPhysicalFitness> selectByExample(TPhysicalFitnessExample example);

    TPhysicalFitness selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TPhysicalFitness record, @Param("example") TPhysicalFitnessExample example);

    int updateByExample(@Param("record") TPhysicalFitness record, @Param("example") TPhysicalFitnessExample example);

    int updateByPrimaryKeySelective(TPhysicalFitness record);

    int updateByPrimaryKey(TPhysicalFitness record);

    List<TPhysicalFitnessCustom1> ListALLPhysicalFitness();
}