package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TCardiopulPlan;
import teenhealth.mybatis.po.TCardiopulPlanCustom;
import teenhealth.mybatis.po.TCardiopulPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TCardiopulPlanMapper {
    int countByExample(TCardiopulPlanExample example);

    int deleteByExample(TCardiopulPlanExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCardiopulPlan record);

    int insertSelective(TCardiopulPlan record);

    List<TCardiopulPlan> selectByExample(TCardiopulPlanExample example);

    TCardiopulPlan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCardiopulPlan record, @Param("example") TCardiopulPlanExample example);

    int updateByExample(@Param("record") TCardiopulPlan record, @Param("example") TCardiopulPlanExample example);

    int updateByPrimaryKeySelective(TCardiopulPlan record);

    int updateByPrimaryKey(TCardiopulPlan record);

    //查询所有学生心肺耐力处方
    List<TCardiopulPlanCustom> listCardiopulmonaryPlan();

    //根据studenid查询学生当前处方
    TCardiopulPlanCustom StudentCardiopulmonaryPlan(String studentid);

    //查询xx学生当前处方开始时间距离今天天数
    Integer PlanDays(String studentid);

    //根据studentid更新训练处方
    int updateByStudentIdSelective(TCardiopulPlan tCardiopulPlan);

    //根据studentid查询xx学生历史处方
    List<TCardiopulPlanCustom> selectPlanHistory(String studentid);

    //查询xxx学生最新心肺耐力处方
    TCardiopulPlan StudentNewCardioPlan(String studentid);

}