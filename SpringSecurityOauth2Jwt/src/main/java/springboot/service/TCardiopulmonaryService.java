package springboot.service;

import springboot.mybatis.po.*;

import java.util.List;

public interface TCardiopulmonaryService {

//心肺耐力测试数据

    //查询所有学生心肺耐力数据
    public List<TCardiopulmonaryCustom> ListCardiopulmonary();

    //通过学号、姓名查询学生心肺耐力测试记录
    public List<TCardiopulmonaryCustom> ListStudentCardio(String studentId);

    //根据心肺耐力测试记录id查询详细心肺耐力测试报告
    public TCardiopulmonary selectCarido(String cardioid);

//心肺耐力训练处方
    //查询所有学生心肺耐力处方
    List<TCardiopulPlanCustom> ListCardiopulmonaryPlan();

    //查询xxx学生心肺耐力所有处方
    public List<TCardiopulPlanCustom> ListPlanHistory(String studentid);

    //查询xxx学生最新心肺耐力处方
    public TCardiopulPlan StudentNewCardioPlan(String studentid);

    //查询xx学生当前处方开始时间距离今天天数
    public Integer PlanDays(String studentid);

    //修改xxx学生训练处方
    public void UpdateTCardiopulPlan(TCardiopulPlan tCardiopulPlan);

    //根据处方id查询xx学生xx处方执行记录
    public List<TCardiopulRecord> StudentCardiopulRecord(String planId);

    //插入心肺耐力测试记录
    void insertSelective(TCardiopulmonary tCardiopulmonary);

    //插入心肺耐力训练处方
    void insertCardiopulPlan (TCardiopulPlan tCardiopulPlan);

    //插入处方训练记录
    void insertCardioRecord(TCardiopulRecord tCardiopulRecord);

    //查询所有学生的有效处方
    List<TCardiopulPlan> ListStudentPlan();
}
