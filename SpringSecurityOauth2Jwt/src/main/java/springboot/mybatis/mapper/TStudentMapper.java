package springboot.mybatis.mapper;

import springboot.mybatis.po.TStudent;
import springboot.mybatis.po.TStudentCustom;
import springboot.mybatis.po.TStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    List<TStudentCustom>selectStudent();

    //根据姓名或学号模糊查询学生信息
    List<TStudentCustom> selectByNameStudentNo(String NameStudentNo);

    //查询班级人数
    Integer selectStudentNum(String ClassId);

    List<TStudent> selectStudentbyClassid(String classId);

    //根据学号查询学生信息
    List<TStudent> selectByStudentNo(String studentNo);
}