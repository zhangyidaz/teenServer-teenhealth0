package springboot.mybatis.mapper;

import springboot.mybatis.po.TCardiopulRecord;
import springboot.mybatis.po.TCardiopulRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCardiopulRecordMapper {
    int countByExample(TCardiopulRecordExample example);

    int deleteByExample(TCardiopulRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCardiopulRecord record);

    int insertSelective(TCardiopulRecord record);

    List<TCardiopulRecord> selectByExample(TCardiopulRecordExample example);

    TCardiopulRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCardiopulRecord record, @Param("example") TCardiopulRecordExample example);

    int updateByExample(@Param("record") TCardiopulRecord record, @Param("example") TCardiopulRecordExample example);

    int updateByPrimaryKeySelective(TCardiopulRecord record);

    int updateByPrimaryKey(TCardiopulRecord record);

    //根据处方id查询xx学生xx处方执行记录
    List<TCardiopulRecord> selectByPlanId(String planId);
}