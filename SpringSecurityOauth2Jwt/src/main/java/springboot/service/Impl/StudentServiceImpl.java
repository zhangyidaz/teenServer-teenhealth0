package springboot.service.Impl;

import springboot.mybatis.po.TStudentCustom;
import springboot.service.StudentService;
import springboot.mybatis.mapper.TGradeMapper;
import springboot.mybatis.mapper.TStudentMapper;
import springboot.mybatis.po.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired TStudentMapper tStudentMapper;

//平台端
    //查询所有学生列表
    @Override
    public List<TStudentCustom> listStudent(){
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
    public Integer updateStudent(String id,TStudent tStudent)throws Exception{
        tStudent.setId(id);
        return tStudentMapper.updateByPrimaryKeySelective(tStudent);
    }

    //删除学生信息
    @Override
    public Integer deleteStudent(String id)throws Exception{
        return tStudentMapper.deleteByPrimaryKey(id);
    }

    //添加单个学生用户
    @Override
    public Integer insertStudent(TStudent tStudent)throws Exception{
        return tStudentMapper.insertSelective(tStudent);
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
