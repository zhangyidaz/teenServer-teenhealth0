package springboot.service.Impl;

import springboot.mybatis.mapper.TTeacherMapper;
import springboot.mybatis.po.TTeacher;
import springboot.service.TTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTeacherServiceImpl implements TTeacherService {
    @Autowired
    TTeacherMapper tTeacherMapper;

    //根据id查询老师信息
    @Override
    public TTeacher selectTeacherbyId(String id){
        return tTeacherMapper.selectByPrimaryKey(id);
    }

    //查询所有老师信息
    @Override
    public List<TTeacher> selectAllTeacher(){
        return tTeacherMapper.listTeachers();
    }

    //根据userId查询教师用户
    @Override
    public TTeacher selectTeacherbyuserId(String userId){
        return tTeacherMapper.selectByuserId(userId);
    }
}

