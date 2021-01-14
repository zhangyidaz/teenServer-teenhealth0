package teenhealth.service.Impl;

import teenhealth.mybatis.mapper.TSomaticGameMapper;
import teenhealth.mybatis.mapper.TSomaticGamePlanMapper;
import teenhealth.mybatis.mapper.TSomaticGameRecordMapper;
import teenhealth.mybatis.po.*;
import teenhealth.service.TSomaticGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tSomaticGameService")
public class TSomaticGameServiceImpl implements TSomaticGameService {
    @Autowired
    TSomaticGameMapper tSomaticGameMapper;
    @Autowired
    TSomaticGamePlanMapper tSomaticGamePlanMapper;
    @Autowired
    TSomaticGameRecordMapper tSomaticGameRecordMapper;

    //平台端
    //显示所有学生体感游戏测试最新报告
    @Override
    public List<TSomaticGameCustom> ListTSomaticGame(){
        return tSomaticGameMapper.listTSomaticGame();
    }

    //显示xx学生体感游戏测试记录
    @Override
    public List<TSomaticGameCustom> ListStudentSomatic(String studentId){
        return tSomaticGameMapper.listStudentSomatic(studentId);
    }

    //根据体感游戏测试记录id查询详细心肺耐力测试报告
    @Override
    public TSomaticGame selectStudentSomatioc(String id){
        return tSomaticGameMapper.selectByPrimaryKey(id);
    }

    //查询所有学生心肺耐力处方
    @Override
    public List<TSomaticGamePlanCustom> ListSomaticPlan(){
        return tSomaticGamePlanMapper.listSomaticPlan();
    }

    //根据studentId查询xx学生的所有体感游戏训练处方
    @Override
    public List<TSomaticGamePlanCustom> ListStudentGamePlan(String studentid){
        return tSomaticGamePlanMapper.listStudentSomaticPlan(studentid);
    }

    //查询xx学生最新的体感游戏训练处方
    @Override
    public TSomaticGamePlan StudentNewSomaticPlan(String studentid){
        return tSomaticGamePlanMapper.selectStudentNewPlan(studentid);
    }

    //查询xx学生当前处方开始时间距离今天天数
    @Override
    public Integer Plandays(String studentid){
        return tSomaticGamePlanMapper.PlanDays(studentid);
    }

    //根据studentid修改学生处方状态
    @Override
    public void UpdateStudentSomaticPlan(TSomaticGamePlan tSomaticGamePlan){
        tSomaticGamePlanMapper.updateByStudentidSelective(tSomaticGamePlan);
    }

    //根据处方id查询xx学生xx处方执行记录
    public List<TSomaticGameRecord> ListSomaticPlanRecords(String id){
        return tSomaticGameRecordMapper.ListSomaticPlanRecords(id);
    }
}
