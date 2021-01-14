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

    public List<TTeacher> selectteachers(){
        return tTeacherMapper.listTeachers();
    }

    //根据id查询老师信息
    public TTeacher selectTeacherbyId(String id){
        return tTeacherMapper.selectByPrimaryKey(id);
    }
}
