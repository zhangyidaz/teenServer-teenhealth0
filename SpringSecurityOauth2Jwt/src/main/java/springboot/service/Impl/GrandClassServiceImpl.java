package springboot.service.Impl;

import springboot.mybatis.mapper.TClassMapper;
import springboot.mybatis.po.TClass;
import springboot.mybatis.po.TClassCustom;
import springboot.service.GrandClassService;
import springboot.mybatis.mapper.TGradeMapper;
import springboot.mybatis.po.TGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GrandClassServiceImpl implements GrandClassService {
    @Autowired private TGradeMapper tGradeMapper;
    @Autowired private TClassMapper tClassMapper;
//平台端
    //查询年级
    @Override
    public List<TGrade> selectGrade(){
        return tGradeMapper.selectGrade();
    }

    //根据年级查询班级
    @Override
    public List<TClass> selectClass(String gradeId){
        return tClassMapper.selectClass(gradeId);
    }

    //根据年级查询班级名称
    public List<TClass> selectClassName(String gradeId){
        return tClassMapper.selectClassName(gradeId);
    }

    //添加班级
    @Override
    public Integer insertClass(TClass tClass){
        return tClassMapper.insertSelective(tClass);
    }

    //获取所有年级班级信息列表
    @Override
    public List<TClassCustom> listClasses(){
        return tClassMapper.ListClasses();
    }
}
