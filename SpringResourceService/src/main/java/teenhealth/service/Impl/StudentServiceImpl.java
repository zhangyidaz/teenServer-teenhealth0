package teenhealth.service.Impl;

import teenhealth.mybatis.po.TStudentCustom;
import teenhealth.service.StudentService;
import teenhealth.mybatis.mapper.TStudentMapper;
import teenhealth.mybatis.po.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("studentService")

public class StudentServiceImpl implements StudentService {
    @Autowired TStudentMapper tStudentMapper;

    //平台端
    //查询所有学生列表
    @Override
    public List<TStudent> listStudent(){
        return tStudentMapper.selectStudent();
    }

    //根据姓名或学号查询学生信息
    @Override
    public TStudent selectByNameStudentNo(String NameStudentNo)throws Exception{
        return tStudentMapper.selectByNameStudentNo(NameStudentNo);
    }

    //根据学生id查询学生年级班级信息
    public TStudentCustom selectBystudentId(String id){
        return tStudentMapper.selectStudentClassGradeById(id);
    }

    //修改学生信息
    @Override
    public void updateStudent(String id,TStudent tStudent)throws Exception{
        tStudent.setId(id);
        tStudentMapper.updateByPrimaryKeySelective(tStudent);
    }

    //删除学生信息
    @Override
    public void deleteStudent(String id)throws Exception{
        tStudentMapper.deleteByPrimaryKey(id);
    }

    //添加单个学生用户
    @Override
    public void insertStudent(TStudent tStudent)throws Exception{
        tStudentMapper.insertSelective(tStudent);
    }

    @Override
    //查询某个班级学生人数
    public Integer selectStudentNum(String ClassId)throws Exception{
        return tStudentMapper.selectStudentNum(ClassId);
    }

    @Override
    //根据classid查询班级下学生信息
    public List<TStudent> listStudentbyClass(String classId){
        return tStudentMapper.selectStudentbyClassid(classId);
    }
}
