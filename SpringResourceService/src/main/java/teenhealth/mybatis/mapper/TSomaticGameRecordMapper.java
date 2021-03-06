package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TSomaticGameRecord;
import teenhealth.mybatis.po.TSomaticGameRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSomaticGameRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int countByExample(TSomaticGameRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int deleteByExample(TSomaticGameRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int insert(TSomaticGameRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int insertSelective(TSomaticGameRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    List<TSomaticGameRecord> selectByExample(TSomaticGameRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    TSomaticGameRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") TSomaticGameRecord record, @Param("example") TSomaticGameRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int updateByExample(@Param("record") TSomaticGameRecord record, @Param("example") TSomaticGameRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int updateByPrimaryKeySelective(TSomaticGameRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_somatic_game_record
     *
     * @mbggenerated Mon Mar 23 10:53:04 CST 2020
     */
    int updateByPrimaryKey(TSomaticGameRecord record);

    //根据处方id查询xx学生xx处方执行记录
    List<TSomaticGameRecord> ListSomaticPlanRecords(String id);
}