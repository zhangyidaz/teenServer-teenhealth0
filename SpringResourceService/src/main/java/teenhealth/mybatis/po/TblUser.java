package teenhealth.mybatis.po;

import java.util.Date;

public class TblUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.password
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.school_id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String schoolId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.phone
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.real_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.sex
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.head_portrait
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String headPortrait;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.create_time
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.is_valid
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private Integer isValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.remark
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.id
     *
     * @return the value of tbl_user.id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.id
     *
     * @param id the value for tbl_user.id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_name
     *
     * @return the value of tbl_user.login_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_name
     *
     * @param loginName the value for tbl_user.login_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.password
     *
     * @return the value of tbl_user.password
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.password
     *
     * @param password the value for tbl_user.password
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.school_id
     *
     * @return the value of tbl_user.school_id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.school_id
     *
     * @param schoolId the value for tbl_user.school_id
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.phone
     *
     * @return the value of tbl_user.phone
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.phone
     *
     * @param phone the value for tbl_user.phone
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.real_name
     *
     * @return the value of tbl_user.real_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.real_name
     *
     * @param realName the value for tbl_user.real_name
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.sex
     *
     * @return the value of tbl_user.sex
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.sex
     *
     * @param sex the value for tbl_user.sex
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.head_portrait
     *
     * @return the value of tbl_user.head_portrait
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.head_portrait
     *
     * @param headPortrait the value for tbl_user.head_portrait
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.create_time
     *
     * @return the value of tbl_user.create_time
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.create_time
     *
     * @param createTime the value for tbl_user.create_time
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.is_valid
     *
     * @return the value of tbl_user.is_valid
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.is_valid
     *
     * @param isValid the value for tbl_user.is_valid
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.remark
     *
     * @return the value of tbl_user.remark
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.remark
     *
     * @param remark the value for tbl_user.remark
     *
     * @mbggenerated Tue Mar 10 15:48:14 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}