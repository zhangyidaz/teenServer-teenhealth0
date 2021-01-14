package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TClass;
import teenhealth.mybatis.po.TClassCustom;
import teenhealth.mybatis.po.TClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassMapper {
    int countByExample(TClassExample example);

    int deleteByExample(TClassExample example);

    int deleteByPrimaryKey(String id);

    int insert(TClass record);

    int insertSelective(TClass record);

    List<TClass> selectByExample(TClassExample example);

    //根据id查询班级信息
    TClass selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TClass record, @Param("example") TClassExample example);

    int updateByExample(@Param("record") TClass record, @Param("example") TClassExample example);

    int updateByPrimaryKeySelective(TClass record);

    int updateByPrimaryKey(TClass record);

    //    根据年级查询班级
    List<TClass> selectClass(String gradeId);

    //    根据年级查询班级名称
    List<TClass> selectClassName(String gradeId);

    //    查询所有班级列表
    List<TClass> listClass();

    //    查询所有班级id
    List<String> listClassId();

    //    查询所有班级列表及负责老师
    List<TClassCustom> listClassandTeacher();

    //获取所有年级班级信息列表
    List<TClassCustom> ListClasses();

    //根据年级id查询班级
    List<TClassCustom> selectClassbyGradeid(String gradeid);

    //根据班级id查询班级和年级信息
    TClassCustom selectClassGradeInfo(String classid);
}