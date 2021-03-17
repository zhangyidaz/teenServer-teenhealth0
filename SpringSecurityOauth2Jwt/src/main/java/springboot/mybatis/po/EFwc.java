package springboot.mybatis.po;

import java.util.Date;

public class EFwc {
    private Integer id;

    private Double fwcMin;

    private Double fwcMax;

    private Integer fwcScore;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFwcMin() {
        return fwcMin;
    }

    public void setFwcMin(Double fwcMin) {
        this.fwcMin = fwcMin;
    }

    public Double getFwcMax() {
        return fwcMax;
    }

    public void setFwcMax(Double fwcMax) {
        this.fwcMax = fwcMax;
    }

    public Integer getFwcScore() {
        return fwcScore;
    }

    public void setFwcScore(Integer fwcScore) {
        this.fwcScore = fwcScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}