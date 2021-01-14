package teenhealth.mybatis.po;

import java.util.Date;

public class TSomaticGame {
    private String id;

    private String studentId;

    private Integer testItem;

    private Integer scoreFlex;

    private Integer scoreBlan;

    private Integer scoreJump;

    private Integer scoreChoosetime;

    private Float resultFlex;

    private Float resultBlan;

    private Float resultJump;

    private Float resultChoosetime;

    private String suggFlex;

    private String suggBlan;

    private String suggJump;

    private String suggChoosetime;

    private String levelFlex;

    private String levelBlan;

    private String levelJump;

    private String levelChoosetime;

    private Date createTime;

    private Date uploadTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getTestItem() {
        return testItem;
    }

    public void setTestItem(Integer testItem) {
        this.testItem = testItem;
    }

    public Integer getScoreFlex() {
        return scoreFlex;
    }

    public void setScoreFlex(Integer scoreFlex) {
        this.scoreFlex = scoreFlex;
    }

    public Integer getScoreBlan() {
        return scoreBlan;
    }

    public void setScoreBlan(Integer scoreBlan) {
        this.scoreBlan = scoreBlan;
    }

    public Integer getScoreJump() {
        return scoreJump;
    }

    public void setScoreJump(Integer scoreJump) {
        this.scoreJump = scoreJump;
    }

    public Integer getScoreChoosetime() {
        return scoreChoosetime;
    }

    public void setScoreChoosetime(Integer scoreChoosetime) {
        this.scoreChoosetime = scoreChoosetime;
    }

    public Float getResultFlex() {
        return resultFlex;
    }

    public void setResultFlex(Float resultFlex) {
        this.resultFlex = resultFlex;
    }

    public Float getResultBlan() {
        return resultBlan;
    }

    public void setResultBlan(Float resultBlan) {
        this.resultBlan = resultBlan;
    }

    public Float getResultJump() {
        return resultJump;
    }

    public void setResultJump(Float resultJump) {
        this.resultJump = resultJump;
    }

    public Float getResultChoosetime() {
        return resultChoosetime;
    }

    public void setResultChoosetime(Float resultChoosetime) {
        this.resultChoosetime = resultChoosetime;
    }

    public String getSuggFlex() {
        return suggFlex;
    }

    public void setSuggFlex(String suggFlex) {
        this.suggFlex = suggFlex;
    }

    public String getSuggBlan() {
        return suggBlan;
    }

    public void setSuggBlan(String suggBlan) {
        this.suggBlan = suggBlan;
    }

    public String getSuggJump() {
        return suggJump;
    }

    public void setSuggJump(String suggJump) {
        this.suggJump = suggJump;
    }

    public String getSuggChoosetime() {
        return suggChoosetime;
    }

    public void setSuggChoosetime(String suggChoosetime) {
        this.suggChoosetime = suggChoosetime;
    }

    public String getLevelFlex() {
        return levelFlex;
    }

    public void setLevelFlex(String levelFlex) {
        this.levelFlex = levelFlex;
    }

    public String getLevelBlan() {
        return levelBlan;
    }

    public void setLevelBlan(String levelBlan) {
        this.levelBlan = levelBlan;
    }

    public String getLevelJump() {
        return levelJump;
    }

    public void setLevelJump(String levelJump) {
        this.levelJump = levelJump;
    }

    public String getLevelChoosetime() {
        return levelChoosetime;
    }

    public void setLevelChoosetime(String levelChoosetime) {
        this.levelChoosetime = levelChoosetime;
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