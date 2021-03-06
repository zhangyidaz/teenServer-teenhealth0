package springboot.mybatis.mapper;

import springboot.mybatis.po.TCardiopulmonary ;
import springboot.mybatis.po.TCardiopulmonaryCustom;
import springboot.mybatis.po.TCardiopulmonaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCardiopulmonaryMapper {

    int countByExample(TCardiopulmonaryExample example);

    int deleteByExample(TCardiopulmonaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCardiopulmonary record);

    int insertSelective(TCardiopulmonary record);

    List<TCardiopulmonary> selectByExampleWithBLOBs(TCardiopulmonaryExample example);

    List<TCardiopulmonary> selectByExample(TCardiopulmonaryExample example);

    TCardiopulmonary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCardiopulmonary record, @Param("example") TCardiopulmonaryExample example);

    int updateByExampleWithBLOBs(@Param("record") TCardiopulmonary record, @Param("example") TCardiopulmonaryExample example);

    int updateByExample(@Param("record") TCardiopulmonary record, @Param("example") TCardiopulmonaryExample example);

    int updateByPrimaryKeySelective(TCardiopulmonary record);

    int updateByPrimaryKeyWithBLOBs(TCardiopulmonary record);

    int updateByPrimaryKey(TCardiopulmonary record);

//    获取心肺耐力测试表
    List<TCardiopulmonaryCustom>listCardiopulmonary();

//    查询xx学生心肺耐力测试记录
    List<TCardiopulmonaryCustom>listStudentCardio(String studentId);

//    根据学生姓名或学号查询心肺耐力测试报告
//    TCardiopulmonary selectCardiobyNameNo(String StudentNameNo);

}