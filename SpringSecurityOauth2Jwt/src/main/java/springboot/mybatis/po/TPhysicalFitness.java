package springboot.mybatis.po;

import java.util.Date;

public class TPhysicalFitness {
    private String id;

    private String studentId;

    private Double tzl;

    private Double zwtqqData;

    private Integer zwtqqScore;

    private Double fwcData;

    private Integer fwcScore;

    private Double ywqzData;

    private Integer ywqzScore;

    private Date createTime;

    private Date uploadTime;

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

    public Double getTzl() {
        return tzl;
    }

    public void setTzl(Double tzl) {
        this.tzl = tzl;
    }

    public Double getZwtqqData() {
        return zwtqqData;
    }

    public void setZwtqqData(Double zwtqqData) {
        this.zwtqqData = zwtqqData;
    }

    public Integer getZwtqqScore() {
        return zwtqqScore;
    }

    public void setZwtqqScore(Integer zwtqqScore) {
        this.zwtqqScore = zwtqqScore;
    }

    public Double getFwcData() {
        return fwcData;
    }

    public void setFwcData(Double fwcData) {
        this.fwcData = fwcData;
    }

    public Integer getFwcScore() {
        return fwcScore;
    }

    public void setFwcScore(Integer fwcScore) {
        this.fwcScore = fwcScore;
    }

    public Double getYwqzData() {
        return ywqzData;
    }

    public void setYwqzData(Double ywqzData) {
        this.ywqzData = ywqzData;
    }

    public Integer getYwqzScore() {
        return ywqzScore;
    }

    public void setYwqzScore(Integer ywqzScore) {
        this.ywqzScore = ywqzScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}