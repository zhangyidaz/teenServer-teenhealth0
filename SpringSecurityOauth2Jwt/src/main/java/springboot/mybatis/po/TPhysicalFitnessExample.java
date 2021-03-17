package springboot.mybatis.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPhysicalFitnessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPhysicalFitnessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andTzlIsNull() {
            addCriterion("tzl is null");
            return (Criteria) this;
        }

        public Criteria andTzlIsNotNull() {
            addCriterion("tzl is not null");
            return (Criteria) this;
        }

        public Criteria andTzlEqualTo(Double value) {
            addCriterion("tzl =", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlNotEqualTo(Double value) {
            addCriterion("tzl <>", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlGreaterThan(Double value) {
            addCriterion("tzl >", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlGreaterThanOrEqualTo(Double value) {
            addCriterion("tzl >=", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlLessThan(Double value) {
            addCriterion("tzl <", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlLessThanOrEqualTo(Double value) {
            addCriterion("tzl <=", value, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlIn(List<Double> values) {
            addCriterion("tzl in", values, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlNotIn(List<Double> values) {
            addCriterion("tzl not in", values, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlBetween(Double value1, Double value2) {
            addCriterion("tzl between", value1, value2, "tzl");
            return (Criteria) this;
        }

        public Criteria andTzlNotBetween(Double value1, Double value2) {
            addCriterion("tzl not between", value1, value2, "tzl");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataIsNull() {
            addCriterion("zwtqq_data is null");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataIsNotNull() {
            addCriterion("zwtqq_data is not null");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataEqualTo(Double value) {
            addCriterion("zwtqq_data =", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataNotEqualTo(Double value) {
            addCriterion("zwtqq_data <>", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataGreaterThan(Double value) {
            addCriterion("zwtqq_data >", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataGreaterThanOrEqualTo(Double value) {
            addCriterion("zwtqq_data >=", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataLessThan(Double value) {
            addCriterion("zwtqq_data <", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataLessThanOrEqualTo(Double value) {
            addCriterion("zwtqq_data <=", value, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataIn(List<Double> values) {
            addCriterion("zwtqq_data in", values, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataNotIn(List<Double> values) {
            addCriterion("zwtqq_data not in", values, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataBetween(Double value1, Double value2) {
            addCriterion("zwtqq_data between", value1, value2, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqDataNotBetween(Double value1, Double value2) {
            addCriterion("zwtqq_data not between", value1, value2, "zwtqqData");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreIsNull() {
            addCriterion("zwtqq_score is null");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreIsNotNull() {
            addCriterion("zwtqq_score is not null");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreEqualTo(Integer value) {
            addCriterion("zwtqq_score =", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreNotEqualTo(Integer value) {
            addCriterion("zwtqq_score <>", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreGreaterThan(Integer value) {
            addCriterion("zwtqq_score >", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zwtqq_score >=", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreLessThan(Integer value) {
            addCriterion("zwtqq_score <", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zwtqq_score <=", value, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreIn(List<Integer> values) {
            addCriterion("zwtqq_score in", values, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreNotIn(List<Integer> values) {
            addCriterion("zwtqq_score not in", values, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreBetween(Integer value1, Integer value2) {
            addCriterion("zwtqq_score between", value1, value2, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andZwtqqScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zwtqq_score not between", value1, value2, "zwtqqScore");
            return (Criteria) this;
        }

        public Criteria andFwcDataIsNull() {
            addCriterion("fwc_data is null");
            return (Criteria) this;
        }

        public Criteria andFwcDataIsNotNull() {
            addCriterion("fwc_data is not null");
            return (Criteria) this;
        }

        public Criteria andFwcDataEqualTo(Double value) {
            addCriterion("fwc_data =", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataNotEqualTo(Double value) {
            addCriterion("fwc_data <>", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataGreaterThan(Double value) {
            addCriterion("fwc_data >", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataGreaterThanOrEqualTo(Double value) {
            addCriterion("fwc_data >=", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataLessThan(Double value) {
            addCriterion("fwc_data <", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataLessThanOrEqualTo(Double value) {
            addCriterion("fwc_data <=", value, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataIn(List<Double> values) {
            addCriterion("fwc_data in", values, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataNotIn(List<Double> values) {
            addCriterion("fwc_data not in", values, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataBetween(Double value1, Double value2) {
            addCriterion("fwc_data between", value1, value2, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcDataNotBetween(Double value1, Double value2) {
            addCriterion("fwc_data not between", value1, value2, "fwcData");
            return (Criteria) this;
        }

        public Criteria andFwcScoreIsNull() {
            addCriterion("fwc_score is null");
            return (Criteria) this;
        }

        public Criteria andFwcScoreIsNotNull() {
            addCriterion("fwc_score is not null");
            return (Criteria) this;
        }

        public Criteria andFwcScoreEqualTo(Integer value) {
            addCriterion("fwc_score =", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreNotEqualTo(Integer value) {
            addCriterion("fwc_score <>", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreGreaterThan(Integer value) {
            addCriterion("fwc_score >", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("fwc_score >=", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreLessThan(Integer value) {
            addCriterion("fwc_score <", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreLessThanOrEqualTo(Integer value) {
            addCriterion("fwc_score <=", value, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreIn(List<Integer> values) {
            addCriterion("fwc_score in", values, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreNotIn(List<Integer> values) {
            addCriterion("fwc_score not in", values, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreBetween(Integer value1, Integer value2) {
            addCriterion("fwc_score between", value1, value2, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andFwcScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("fwc_score not between", value1, value2, "fwcScore");
            return (Criteria) this;
        }

        public Criteria andYwqzDataIsNull() {
            addCriterion("ywqz_data is null");
            return (Criteria) this;
        }

        public Criteria andYwqzDataIsNotNull() {
            addCriterion("ywqz_data is not null");
            return (Criteria) this;
        }

        public Criteria andYwqzDataEqualTo(Double value) {
            addCriterion("ywqz_data =", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataNotEqualTo(Double value) {
            addCriterion("ywqz_data <>", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataGreaterThan(Double value) {
            addCriterion("ywqz_data >", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataGreaterThanOrEqualTo(Double value) {
            addCriterion("ywqz_data >=", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataLessThan(Double value) {
            addCriterion("ywqz_data <", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataLessThanOrEqualTo(Double value) {
            addCriterion("ywqz_data <=", value, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataIn(List<Double> values) {
            addCriterion("ywqz_data in", values, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataNotIn(List<Double> values) {
            addCriterion("ywqz_data not in", values, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataBetween(Double value1, Double value2) {
            addCriterion("ywqz_data between", value1, value2, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzDataNotBetween(Double value1, Double value2) {
            addCriterion("ywqz_data not between", value1, value2, "ywqzData");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreIsNull() {
            addCriterion("ywqz_score is null");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreIsNotNull() {
            addCriterion("ywqz_score is not null");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreEqualTo(Integer value) {
            addCriterion("ywqz_score =", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreNotEqualTo(Integer value) {
            addCriterion("ywqz_score <>", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreGreaterThan(Integer value) {
            addCriterion("ywqz_score >", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ywqz_score >=", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreLessThan(Integer value) {
            addCriterion("ywqz_score <", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreLessThanOrEqualTo(Integer value) {
            addCriterion("ywqz_score <=", value, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreIn(List<Integer> values) {
            addCriterion("ywqz_score in", values, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreNotIn(List<Integer> values) {
            addCriterion("ywqz_score not in", values, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreBetween(Integer value1, Integer value2) {
            addCriterion("ywqz_score between", value1, value2, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andYwqzScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ywqz_score not between", value1, value2, "ywqzScore");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}