package springboot.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.mybatis.po.EZwtqq;
import springboot.mybatis.po.EZwtqqExample;

public interface EZwtqqMapper {
    long countByExample(EZwtqqExample example);

    int deleteByExample(EZwtqqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EZwtqq record);

    int insertSelective(EZwtqq record);

    List<EZwtqq> selectByExample(EZwtqqExample example);

    EZwtqq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EZwtqq record, @Param("example") EZwtqqExample example);

    int updateByExample(@Param("record") EZwtqq record, @Param("example") EZwtqqExample example);

    int updateByPrimaryKeySelective(EZwtqq record);

    int updateByPrimaryKey(EZwtqq record);
}