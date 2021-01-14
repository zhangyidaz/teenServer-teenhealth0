package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TCardiopulmonary;
import teenhealth.mybatis.po.TCardiopulmonaryCustom;
import teenhealth.mybatis.po.TCardiopulmonaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCardiopulmonaryMapper {
    int countByExample(TCardiopulmonaryExample example);

    int deleteByExample(TCardiopulmonaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCardiopulmonary record);

    int insertSelective(TCardiopulmonary record);

    List<TCardiopulmonary> selectByExampleWithBLOBs(TCardiopulmonaryExample example);

    List<TCardiopulmonary> selectByExample(TCardiopulmonaryExample example);

    TCardiopulmonaryCustom selectByPrimaryKey(String id);

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
    TCardiopulmonary selectCardiobyNameNo(String StudentNameNo);

}