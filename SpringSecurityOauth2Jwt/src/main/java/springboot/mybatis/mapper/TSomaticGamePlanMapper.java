package springboot.mybatis.mapper;

import io.swagger.models.auth.In;
import springboot.mybatis.po.TSomaticGamePlan;
import springboot.mybatis.po.TSomaticGamePlanCustom;
import springboot.mybatis.po.TSomaticGamePlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSomaticGamePlanMapper {
    int countByExample(TSomaticGamePlanExample example);

    int deleteByExample(TSomaticGamePlanExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSomaticGamePlan record);

    int insertSelective(TSomaticGamePlan record);

    List<TSomaticGamePlan> selectByExample(TSomaticGamePlanExample example);

    TSomaticGamePlan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSomaticGamePlan record, @Param("example") TSomaticGamePlanExample example);

    int updateByExample(@Param("record") TSomaticGamePlan record, @Param("example") TSomaticGamePlanExample example);

    int updateByPrimaryKeySelective(TSomaticGamePlan record);

    int updateByPrimaryKey(TSomaticGamePlan record);

    //查询所有学生心肺耐力处方
    List<TSomaticGamePlanCustom> listSomaticPlan();

    //根据studenid查询学生处方
    List<TSomaticGamePlanCustom> listStudentSomaticPlan(String studentid);

    //查询xx学生当前处方开始时间距离今天天数
    Integer PlanDays(String studentid);

    //根据studentid更新训练处方
    int updateByStudentidSelective(TSomaticGamePlan tSomaticGamePlan);

    //根据studentid查询学生最新处方
    TSomaticGamePlan selectStudentNewPlan(String studentid);

    //查询所有可用处方对应的学生Id
    List<TSomaticGamePlan> ListStudentId();
}