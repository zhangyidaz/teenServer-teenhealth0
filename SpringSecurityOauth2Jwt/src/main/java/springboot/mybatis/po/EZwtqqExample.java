package springboot.mybatis.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EZwtqqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EZwtqqExample() {
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

        public Criteria andZwtqqMinIsNull() {
            addCriterion("zwtqq_min is null");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinIsNotNull() {
            addCriterion("zwtqq_min is not null");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinEqualTo(Double value) {
            addCriterion("zwtqq_min =", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinNotEqualTo(Double value) {
            addCriterion("zwtqq_min <>", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinGreaterThan(Double value) {
            addCriterion("zwtqq_min >", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinGreaterThanOrEqualTo(Double value) {
            addCriterion("zwtqq_min >=", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinLessThan(Double value) {
            addCriterion("zwtqq_min <", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinLessThanOrEqualTo(Double value) {
            addCriterion("zwtqq_min <=", value, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinIn(List<Double> values) {
            addCriterion("zwtqq_min in", values, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinNotIn(List<Double> values) {
            addCriterion("zwtqq_min not in", values, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinBetween(Double value1, Double value2) {
            addCriterion("zwtqq_min between", value1, value2, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMinNotBetween(Double value1, Double value2) {
            addCriterion("zwtqq_min not between", value1, value2, "zwtqqMin");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxIsNull() {
            addCriterion("zwtqq_max is null");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxIsNotNull() {
            addCriterion("zwtqq_max is not null");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxEqualTo(Double value) {
            addCriterion("zwtqq_max =", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxNotEqualTo(Double value) {
            addCriterion("zwtqq_max <>", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxGreaterThan(Double value) {
            addCriterion("zwtqq_max >", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("zwtqq_max >=", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxLessThan(Double value) {
            addCriterion("zwtqq_max <", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxLessThanOrEqualTo(Double value) {
            addCriterion("zwtqq_max <=", value, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxIn(List<Double> values) {
            addCriterion("zwtqq_max in", values, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxNotIn(List<Double> values) {
            addCriterion("zwtqq_max not in", values, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxBetween(Double value1, Double value2) {
            addCriterion("zwtqq_max between", value1, value2, "zwtqqMax");
            return (Criteria) this;
        }

        public Criteria andZwtqqMaxNotBetween(Double value1, Double value2) {
            addCriterion("zwtqq_max not between", value1, value2, "zwtqqMax");
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