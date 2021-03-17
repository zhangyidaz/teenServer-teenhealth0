package springboot.mybatis.po;

import java.util.Date;

public class EYwqz {
    private Integer id;

    private Double ywqzMin;

    private Double ywqzMax;

    private Integer ywqzScore;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getYwqzMin() {
        return ywqzMin;
    }

    public void setYwqzMin(Double ywqzMin) {
        this.ywqzMin = ywqzMin;
    }

    public Double getYwqzMax() {
        return ywqzMax;
    }

    public void setYwqzMax(Double ywqzMax) {
        this.ywqzMax = ywqzMax;
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
}