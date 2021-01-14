package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TSomaticGame;
import teenhealth.mybatis.po.TSomaticGameCustom;
import teenhealth.mybatis.po.TSomaticGameExample;
import teenhealth.mybatis.po.TSomaticGameWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSomaticGameMapper {
    int countByExample(TSomaticGameExample example);

    int deleteByExample(TSomaticGameExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSomaticGameWithBLOBs record);

    int insertSelective(TSomaticGameWithBLOBs record);

    List<TSomaticGameWithBLOBs> selectByExampleWithBLOBs(TSomaticGameExample example);

    List<TSomaticGame> selectByExample(TSomaticGameExample example);

    TSomaticGameWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSomaticGameWithBLOBs record, @Param("example") TSomaticGameExample example);

    int updateByExampleWithBLOBs(@Param("record") TSomaticGameWithBLOBs record, @Param("example") TSomaticGameExample example);

    int updateByExample(@Param("record") TSomaticGame record, @Param("example") TSomaticGameExample example);

    int updateByPrimaryKeySelective(TSomaticGameWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TSomaticGameWithBLOBs record);

    int updateByPrimaryKey(TSomaticGame record);

    //显示所有学生体感游戏测试最新报告
    List<TSomaticGameCustom> listTSomaticGame();

    //显示xx学生体感游戏测试记录
    List<TSomaticGameCustom> listStudentSomatic(String studentId);
}