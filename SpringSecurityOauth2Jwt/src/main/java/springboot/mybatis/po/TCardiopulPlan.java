package springboot.mybatis.po;

import java.util.Date;

public class TCardiopulPlan {
    private String id;

    private String studentId;

    private Integer exemode;

    private Integer exeunit;

    private Integer exelength;

    private Integer exefreq;

    private Integer execycle;

    private Integer maxHr;

    private Integer maxPowe;

    private Double intHrK;

    private Double intHrB;

    private Integer userHr;

    private Integer isEnable;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getExeunit() {
        return exeunit;
    }

    public void setExeunit(Integer exeunit) {
        this.exeunit = exeunit;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getExemode() {
        return exemode;
    }

    public void setExemode(Integer exemode) {
        this.exemode = exemode;
    }

    public Integer getExelength() {
        return exelength;
    }

    public void setExelength(Integer exelength) {
        this.exelength = exelength;
    }

    public Integer getExefreq() {
        return exefreq;
    }

    public void setExefreq(Integer exefreq) {
        this.exefreq = exefreq;
    }

    public Integer getExecycle() {
        return execycle;
    }

    public void setExecycle(Integer execycle) {
        this.execycle = execycle;
    }

    public Integer getMaxHr() {
        return maxHr;
    }

    public void setMaxHr(Integer maxHr) {
        this.maxHr = maxHr;
    }

    public Integer getMaxPowe() {
        return maxPowe;
    }

    public void setMaxPowe(Integer maxPowe) {
        this.maxPowe = maxPowe;
    }

    public Double getIntHrK() {
        return intHrK;
    }

    public void setIntHrK(Double intHrK) {
        this.intHrK = intHrK;
    }

    public Double getIntHrB() {
        return intHrB;
    }

    public void setIntHrB(Double intHrB) {
        this.intHrB = intHrB;
    }

    public Integer getUserHr() {
        return userHr;
    }

    public void setUserHr(Integer userHr) {
        this.userHr = userHr;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}