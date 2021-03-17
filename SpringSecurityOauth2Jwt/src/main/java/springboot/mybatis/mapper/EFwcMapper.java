package springboot.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.mybatis.po.EFwc;
import springboot.mybatis.po.EFwcExample;

public interface EFwcMapper {
    long countByExample(EFwcExample example);

    int deleteByExample(EFwcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EFwc record);

    int insertSelective(EFwc record);

    List<EFwc> selectByExample(EFwcExample example);

    EFwc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EFwc record, @Param("example") EFwcExample example);

    int updateByExample(@Param("record") EFwc record, @Param("example") EFwcExample example);

    int updateByPrimaryKeySelective(EFwc record);

    int updateByPrimaryKey(EFwc record);
}