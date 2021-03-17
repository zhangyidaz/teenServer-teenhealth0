package springboot.mybatis.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EFwcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EFwcExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFwcMinIsNull() {
            addCriterion("fwc_min is null");
            return (Criteria) this;
        }

        public Criteria andFwcMinIsNotNull() {
            addCriterion("fwc_min is not null");
            return (Criteria) this;
        }

        public Criteria andFwcMinEqualTo(Double value) {
            addCriterion("fwc_min =", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinNotEqualTo(Double value) {
            addCriterion("fwc_min <>", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinGreaterThan(Double value) {
            addCriterion("fwc_min >", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinGreaterThanOrEqualTo(Double value) {
            addCriterion("fwc_min >=", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinLessThan(Double value) {
            addCriterion("fwc_min <", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinLessThanOrEqualTo(Double value) {
            addCriterion("fwc_min <=", value, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinIn(List<Double> values) {
            addCriterion("fwc_min in", values, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinNotIn(List<Double> values) {
            addCriterion("fwc_min not in", values, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinBetween(Double value1, Double value2) {
            addCriterion("fwc_min between", value1, value2, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMinNotBetween(Double value1, Double value2) {
            addCriterion("fwc_min not between", value1, value2, "fwcMin");
            return (Criteria) this;
        }

        public Criteria andFwcMaxIsNull() {
            addCriterion("fwc_max is null");
            return (Criteria) this;
        }

        public Criteria andFwcMaxIsNotNull() {
            addCriterion("fwc_max is not null");
            return (Criteria) this;
        }

        public Criteria andFwcMaxEqualTo(Double value) {
            addCriterion("fwc_max =", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxNotEqualTo(Double value) {
            addCriterion("fwc_max <>", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxGreaterThan(Double value) {
            addCriterion("fwc_max >", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("fwc_max >=", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxLessThan(Double value) {
            addCriterion("fwc_max <", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxLessThanOrEqualTo(Double value) {
            addCriterion("fwc_max <=", value, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxIn(List<Double> values) {
            addCriterion("fwc_max in", values, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxNotIn(List<Double> values) {
            addCriterion("fwc_max not in", values, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxBetween(Double value1, Double value2) {
            addCriterion("fwc_max between", value1, value2, "fwcMax");
            return (Criteria) this;
        }

        public Criteria andFwcMaxNotBetween(Double value1, Double value2) {
            addCriterion("fwc_max not between", value1, value2, "fwcMax");
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