package springboot.service;

import io.swagger.models.auth.In;
import springboot.mybatis.po.TStudent;
import springboot.mybatis.po.TStudentCustom;

import java.util.List;

public interface StudentService {
    //查询所有学生列表
    public List<TStudentCustom> listStudent();

    //根据学号查询学生信息
    List<TStudent> selectByStudentNo(String studentNo);

    //根据姓名或学号模糊查询学生信息
    public List<TStudentCustom> selectByNameStudentNo(String NameStudentNo)throws Exception;

    //根据学生id查询学生年级班级信息
    public TStudentCustom selectBystudentId(String id);

    //修改学生信息
    public Integer updateStudent(String id, TStudent tStudent)throws Exception;

    //删除学生信息
    public Integer deleteStudent(String id)throws Exception;

    //添加单个学生用户
    public Integer insertStudent(TStudent tStudent)throws Exception;

    //查询某个班级学生人数
    public Integer selectStudentNum(String ClassId)throws Exception;

    //根据classid查询班级下学生信息
    public List<TStudent> listStudentbyClass(String classId);


}
