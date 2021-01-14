package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TStudent;
import teenhealth.mybatis.po.TStudentCustom;
import teenhealth.mybatis.po.TStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStudentMapper {
    int countByExample(TStudentExample example);

    int deleteByExample(TStudentExample example);

    int deleteByPrimaryKey(String id);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    List<TStudent> selectByExample(TStudentExample example);

    TStudent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TStudent record, @Param("example") TStudentExample example);

    int updateByExample(@Param("record") TStudent record, @Param("example") TStudentExample example);

    //修改学生信息
    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);

    //根据学生id关联年级班级查询
    TStudentCustom selectStudentClassGradeById(String id);

    //获取学生基本信息列表
    List<TStudent>selectStudent();

    //根据姓名或学号查询学生信息
    TStudent selectByNameStudentNo(String NameStudentNo);

    //查询班级人数
    Integer selectStudentNum(String ClassId);

    List<TStudent> selectStudentbyClassid(String classId);
}