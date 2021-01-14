package springboot.mybatis.mapper;

import springboot.mybatis.po.TEyesight;
import springboot.mybatis.po.TEyesightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TEyesightMapper {

    int countByExample(TEyesightExample example);

    int deleteByExample(TEyesightExample example);

    int deleteByPrimaryKey(String id);

    int insert(TEyesight record);

    int insertSelective(TEyesight record);

    List<TEyesight> selectByExample(TEyesightExample example);

    TEyesight selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TEyesight record, @Param("example") TEyesightExample example);

    int updateByExample(@Param("record") TEyesight record, @Param("example") TEyesightExample example);

    int updateByPrimaryKeySelective(TEyesight record);

    int updateByPrimaryKey(TEyesight record);

    List<TEyesight> ListEyesight();
}