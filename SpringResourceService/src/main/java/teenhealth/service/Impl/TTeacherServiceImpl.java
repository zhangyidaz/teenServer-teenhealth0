package teenhealth.service.Impl;

import teenhealth.mybatis.mapper.TTeacherMapper;
import teenhealth.mybatis.po.TTeacher;
import teenhealth.service.TTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tTeacherService")
public class TTeacherServiceImpl implements TTeacherService {
    @Autowired
    TTeacherMapper tTeacherMapper;

    public List<TTeacher> selectteachers(){
        return tTeacherMapper.listTeachers();
    }
}
