package springboot.mybatis.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TEyesight {

    private String id;

    private String studentId;

    private String leftNwz;

    private String rightNwz;

    private String leftSxz;

    private String rightSxz;

    private String leftSxx;

    private String rightSxx;

    private String testadvice;

    private String trainplan;

    private String eatingadvice;

    private String execisingadvice;

    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date uploadtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getLeftNwz() {
        return leftNwz;
    }

    public void setLeftNwz(String leftNwz) {
        this.leftNwz = leftNwz == null ? null : leftNwz.trim();
    }

    public String getRightNwz() {
        return rightNwz;
    }

    public void setRightNwz(String rightNwz) {
        this.rightNwz = rightNwz == null ? null : rightNwz.trim();
    }

    public String getLeftSxz() {
        return leftSxz;
    }

    public void setLeftSxz(String leftSxz) {
        this.leftSxz = leftSxz == null ? null : leftSxz.trim();
    }

    public String getRightSxz() {
        return rightSxz;
    }

    public void setRightSxz(String rightSxz) {
        this.rightSxz = rightSxz == null ? null : rightSxz.trim();
    }

    public String getLeftSxx() {
        return leftSxx;
    }

    public void setLeftSxx(String leftSxx) {
        this.leftSxx = leftSxx == null ? null : leftSxx.trim();
    }

    public String getRightSxx() {
        return rightSxx;
    }

    public void setRightSxx(String rightSxx) {
        this.rightSxx = rightSxx == null ? null : rightSxx.trim();
    }

    public String getTestadvice() {
        return testadvice;
    }

    public void setTestadvice(String testadvice) {
        this.testadvice = testadvice == null ? null : testadvice.trim();
    }

    public String getTrainplan() {
        return trainplan;
    }

    public void setTrainplan(String trainplan) {
        this.trainplan = trainplan == null ? null : trainplan.trim();
    }

    public String getEatingadvice() {
        return eatingadvice;
    }

    public void setEatingadvice(String eatingadvice) {
        this.eatingadvice = eatingadvice == null ? null : eatingadvice.trim();
    }

    public String getExecisingadvice() {
        return execisingadvice;
    }

    public void setExecisingadvice(String execisingadvice) {
        this.execisingadvice = execisingadvice == null ? null : execisingadvice.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}