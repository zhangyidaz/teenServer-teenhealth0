package teenhealth.service;

import teenhealth.mybatis.po.TTeacher;

import java.util.List;

public interface TTeacherService {
    public List<TTeacher> selectteachers();
}
