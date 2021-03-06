package teenhealth.mybatis.mapper;

import teenhealth.mybatis.po.TblUser;
import teenhealth.mybatis.po.TblUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int countByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int deleteByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int insert(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int insertSelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    List<TblUser> selectByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    TblUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") TblUser record, @Param("example") TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int updateByExample(@Param("record") TblUser record, @Param("example") TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int updateByPrimaryKeySelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    int updateByPrimaryKey(TblUser record);

    TblUser selectUserByloginName(String loginName);
}