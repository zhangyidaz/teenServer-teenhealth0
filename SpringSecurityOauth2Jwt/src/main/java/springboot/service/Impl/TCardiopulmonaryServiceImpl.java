package springboot.service.Impl;

import springboot.mybatis.mapper.TCardiopulPlanMapper;
import springboot.mybatis.mapper.TCardiopulRecordMapper;
import springboot.mybatis.mapper.TCardiopulmonaryMapper;
import springboot.mybatis.po.*;
import springboot.service.TCardiopulmonaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCardiopulmonaryServiceImpl implements TCardiopulmonaryService {
    @Autowired
    TCardiopulmonaryMapper tCardiopulmonaryMapper;
    @Autowired
    TCardiopulPlanMapper tCardiopulPlanMapper;
    @Autowired
    TCardiopulRecordMapper tCardiopulRecordMapper;

//平台端
    @Override
    //查询所有学生心肺耐力数据
    public List<TCardiopulmonaryCustom> ListCardiopulmonary(){
        return tCardiopulmonaryMapper.listCardiopulmonary();
    }

    @Override
    //查询xx学生心肺耐力测试记录
    public List<TCardiopulmonaryCustom> ListStudentCardio(String studentId){
        return tCardiopulmonaryMapper.listStudentCardio(studentId);
    }

    @Override
    //根据心肺耐力测试记录id查询详细心肺耐力测试报告
    public TCardiopulmonary selectCarido(String cardioid){
        return tCardiopulmonaryMapper.selectByPrimaryKey(cardioid);
    }

    @Override
    //查询所有学生心肺耐力处方
    public List<TCardiopulPlanCustom> ListCardiopulmonaryPlan(){
        return tCardiopulPlanMapper.listCardiopulmonaryPlan();
    }

    @Override
    //根据studenid查询xxx学生所有处方
    public List<TCardiopulPlanCustom> ListPlanHistory(String studentid){
        return tCardiopulPlanMapper.selectPlanHistory(studentid);
    }

    @Override
    //查询xxx学生最新心肺耐力处方
    public TCardiopulPlan StudentNewCardioPlan(String studentid){
        return tCardiopulPlanMapper.StudentNewCardioPlan(studentid);
    }

    @Override
    //查询xx学生当前处方开始时间距离今天天数
    public Integer PlanDays(String studentid){
        return tCardiopulPlanMapper.PlanDays(studentid);
    }

    @Override
    //修改xxx学生训练处方
    public void UpdateTCardiopulPlan(TCardiopulPlan tCardiopulPlan){
        tCardiopulPlanMapper.updateByStudentIdSelective(tCardiopulPlan);
    }

    @Override
    //根据处方id查询xx学生xx处方执行记录
    public List<TCardiopulRecord> StudentCardiopulRecord(String planId){
        return tCardiopulRecordMapper.selectByPlanId(planId);
    }

    @Override
    //查询所有学生的有效处方
    public List<TCardiopulPlan> ListStudentPlan(){
        return tCardiopulPlanMapper.ListStudentPlan();
    }

//////////////////////终端设备//////////////////////////
    @Override
    //插入心肺耐力测试记录
    public void insertSelective(TCardiopulmonary tCardiopulmonary){
        tCardiopulmonaryMapper.insertSelective(tCardiopulmonary);
    }

    @Override
    //插入心肺耐力训练处方
    public void insertCardiopulPlan (TCardiopulPlan tCardiopulPlan){
        tCardiopulPlanMapper.insertSelective(tCardiopulPlan);
    }

    @Override
    //插入处方训练记录
    public void insertCardioRecord(TCardiopulRecord tCardiopulRecord){
        tCardiopulRecordMapper.insertSelective(tCardiopulRecord);
    }

}
