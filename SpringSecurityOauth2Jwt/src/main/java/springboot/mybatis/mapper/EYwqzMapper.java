package springboot.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.mybatis.po.EYwqz;
import springboot.mybatis.po.EYwqzExample;

public interface EYwqzMapper {
    long countByExample(EYwqzExample example);

    int deleteByExample(EYwqzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EYwqz record);

    int insertSelective(EYwqz record);

    List<EYwqz> selectByExample(EYwqzExample example);

    EYwqz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EYwqz record, @Param("example") EYwqzExample example);

    int updateByExample(@Param("record") EYwqz record, @Param("example") EYwqzExample example);

    int updateByPrimaryKeySelective(EYwqz record);

    int updateByPrimaryKey(EYwqz record);
}