package springboot.mybatis.mapper;

import springboot.mybatis.po.TTeacher;
import springboot.mybatis.po.TTeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTeacherMapper {

    int countByExample(TTeacherExample example);

    int deleteByExample(TTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    List<TTeacher> selectByExample(TTeacherExample example);

    TTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByExample(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);

    //查询所有老师
    List<TTeacher> listTeachers();

    //根据userId查询老师用户
    TTeacher selectByuserId(String userId);
}