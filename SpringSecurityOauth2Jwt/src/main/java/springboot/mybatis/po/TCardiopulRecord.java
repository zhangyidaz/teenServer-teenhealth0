package springboot.mybatis.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TCardiopulRecord {
    private String id;

    private String planId;

    private String studentId;

    private Integer trainTime;

    private Integer testScore;

    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date uploadTime;

    private Double averageSpeed;

    private Integer isEnables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cardiopul_record.student_id
     *
     * @param studentId the value for t_cardiopul_record.student_id
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cardiopul_record.train_time
     *
     * @return the value of t_cardiopul_record.train_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Integer getTrainTime() {
        return trainTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cardiopul_record.train_time
     *
     * @param trainTime the value for t_cardiopul_record.train_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setTrainTime(Integer trainTime) {
        this.trainTime = trainTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cardiopul_record.test_score
     *
     * @return the value of t_cardiopul_record.test_score
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Integer getTestScore() {
        return testScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cardiopul_record.test_score
     *
     * @param testScore the value for t_cardiopul_record.test_score
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cardiopul_record.create_time
     *
     * @return the value of t_cardiopul_record.create_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cardiopul_record.create_time
     *
     * @param createTime the value for t_cardiopul_record.create_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cardiopul_record.upload_time
     *
     * @return the value of t_cardiopul_record.upload_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cardiopul_record.upload_time
     *
     * @param uploadTime the value for t_cardiopul_record.upload_time
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cardiopul_record.average_speed
     *
     * @return the value of t_cardiopul_record.average_speed
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Integer getIsEnable() {
        return isEnables;
    }

    public void setIsEnables(Integer isEnables) {
        this.isEnables = isEnables;
    }
}