package springboot.service;

import springboot.mybatis.po.TClass;
import springboot.mybatis.po.TClassCustom;

import java.util.Collection;
import java.util.List;

public interface ClassService {
    //查找所有班级信息
    public List<TClass> findAllTClass();

    //查询所有班级的id
    public List<String> findAllTClassId();

    //更新班级人数
    public void updateStudentNum(String id, TClass tClass);

    //查询所有班级及老师姓名
    public List<TClassCustom> findAllClassandTeacher();

    //根据id查询班级信息
    public TClass selectClassInfo(String id);

    //根据id删除班级信息
    public Integer deleteClass(String classId);

    //根据年级id查询班级
    List<TClassCustom> selectClassbyGradeid(String gradeid);

    //根据班级id查询班级和年级信息
    public TClassCustom selectClassGradeInfo(String classid);

    //保存班级信息
    public Integer updateClassInfo(TClass tClass);
}
