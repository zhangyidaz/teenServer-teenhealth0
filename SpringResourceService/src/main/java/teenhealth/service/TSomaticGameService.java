package teenhealth.service;

import teenhealth.mybatis.po.*;

import java.util.List;

public interface TSomaticGameService {

    //    显示所有学生体感游戏测试最新报告
    public List<TSomaticGameCustom> ListTSomaticGame();

    //    显示xx学生体感游戏测试记录
    public List<TSomaticGameCustom> ListStudentSomatic(String studentId);

    //根据id查询详细体感游戏测试记录
    public TSomaticGame selectStudentSomatioc(String studentid);

    //查询所有学生心肺耐力处方
    List<TSomaticGamePlanCustom> ListSomaticPlan();

    //根据studentId查询xx学生的所有体感游戏训练处方
    List<TSomaticGamePlanCustom> ListStudentGamePlan(String studentid);

    //查询xx学生最新的体感游戏训练处方
    public TSomaticGamePlan StudentNewSomaticPlan(String studentid);

    //查询xx学生当前处方开始时间距离今天天数
    public Integer Plandays(String studentid);

    //根据studentid修改学生处方状态
    public void UpdateStudentSomaticPlan(TSomaticGamePlan tSomaticGamePlan);

    //根据处方id查询xx学生xx处方执行记录
    List<TSomaticGameRecord> ListSomaticPlanRecords(String id);
}
