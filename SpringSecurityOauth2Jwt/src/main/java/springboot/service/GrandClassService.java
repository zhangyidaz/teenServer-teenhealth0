package springboot.service;

import springboot.mybatis.po.TClass;
import springboot.mybatis.po.TClassCustom;
import springboot.mybatis.po.TGrade;

import java.util.List;

public interface GrandClassService {
    //查询年级
    public List<TGrade> selectGrade();

    //根据年级查询班级
    public List<TClass> selectClass(String gradeId);

    //根据年级查询班级名称
    public List<TClass> selectClassName(String gradeId);

    //添加班级
    public Integer insertClass(TClass tClass);

    //获取所有年级班级信息列表
    public List<TClassCustom> listClasses();
}
