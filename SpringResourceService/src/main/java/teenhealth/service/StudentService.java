package teenhealth.service;

import teenhealth.mybatis.po.TStudent;
import teenhealth.mybatis.po.TStudentCustom;

import java.util.List;

public interface StudentService {
    //查询所有学生列表
    public List<TStudent> listStudent();

    //根据姓名或学号查询学生信息
    public TStudent selectByNameStudentNo(String NameStudentNo)throws Exception;

    //根据学生id查询学生年级班级信息
    public TStudentCustom selectBystudentId(String id);

    //修改学生信息
    public void updateStudent(String id, TStudent tStudent)throws Exception;

    //删除学生信息
    public void deleteStudent(String id)throws Exception;

    //添加单个学生用户
    public void insertStudent(TStudent tStudent)throws Exception;

    //查询某个班级学生人数
    public Integer selectStudentNum(String ClassId)throws Exception;

    //根据classid查询班级下学生信息
    public List<TStudent> listStudentbyClass(String classId);

}
