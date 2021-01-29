package springboot.service;

import springboot.mybatis.po.TTeacher;

import java.util.List;

public interface TTeacherService {
    //查询所有老师信息
    public List<TTeacher> selectteachers();

    //根据id查询老师信息
    public TTeacher selectTeacherbyId(String id);

    //查询所有老师信息
    List<TTeacher> selectAllTeacher();
}
