package springboot.service;

import springboot.mybatis.po.TTeacher;

import java.util.List;

public interface TTeacherService {

    //根据id查询老师信息
    TTeacher selectTeacherbyId(String id);

    //查询所有老师信息
    List<TTeacher> selectAllTeacher();

    //根据userId查询教师用户
    TTeacher selectTeacherbyuserId(String userId);
}
