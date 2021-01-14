package springboot.mybatis.mapper;

import springboot.mybatis.po.TblRole ;
import springboot.mybatis.po.TblRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblRoleMapper {

    TblRole selectRoleName(String loginName);
}