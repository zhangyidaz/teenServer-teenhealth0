package springboot.mybatis.mapper;

import springboot.mybatis.po.TSomaticGame;
import springboot.mybatis.po.TSomaticGameCustom;
import springboot.mybatis.po.TSomaticGameExample;
import springboot.mybatis.po.TSomaticGameWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSomaticGameMapper {
    int countByExample(TSomaticGameExample example);

    int deleteByExample(TSomaticGameExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSomaticGameWithBLOBs record);

    int insertSelective(TSomaticGame record);

    List<TSomaticGameWithBLOBs> selectByExampleWithBLOBs(TSomaticGameExample example);

    List<TSomaticGame> selectByExample(TSomaticGameExample example);

    TSomaticGame selectByPrimaryKey(String id);

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