package teenhealth.service.Impl;

import teenhealth.mybatis.mapper.TClassMapper;
import teenhealth.mybatis.po.TClass;
import teenhealth.mybatis.po.TClassCustom;
import teenhealth.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classService")
public class ClassServiceImpl implements ClassService {
    @Autowired
    TClassMapper tClassMapper;

    //查找所有班级信息
    @Override
    public List<TClass> findAllTClass(){
        return tClassMapper.listClass();
    }

    //查询所有班级的id
    @Override
    public List<String> findAllTClassId(){
        return tClassMapper.listClassId();
    }

    //更新班级人数
    @Override
    public void updateStudentNum (String id, TClass tClass){
        tClass.setId(id);
        tClassMapper.updateByPrimaryKeySelective(tClass);
    }

    //查询所有班级及老师姓名
    @Override
    public List<TClassCustom> findAllClassandTeacher(){
        return tClassMapper.listClassandTeacher();
    }

    //根据id查询班级信息
    @Override
    public TClass selectClassInfo(String id){
        return tClassMapper.selectByPrimaryKey(id);
    }

    //根据id删除班级信息
    @Override
    public void deleteClass(String classId){
        tClassMapper.deleteByPrimaryKey(classId);
    }

    //根据年级id查询班级
    @Override
    public List<TClassCustom> selectClassbyGradeid(String gradeid){
        return tClassMapper.selectClassbyGradeid(gradeid);
    }

    //根据班级id查询班级和年级信息
    @Override
    public TClassCustom selectClassGradeInfo(String classid){
        return tClassMapper.selectClassGradeInfo(classid);
    }

    //保存班级信息
    @Override
    public void updateClassInfo(TClass tClass){
        tClassMapper.updateByPrimaryKeySelective(tClass);
    }
}
