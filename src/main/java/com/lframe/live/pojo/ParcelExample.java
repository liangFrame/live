package com.lframe.live.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParcelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParcelExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNull() {
            addCriterion("giftId is null");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNotNull() {
            addCriterion("giftId is not null");
            return (Criteria) this;
        }

        public Criteria andGiftidEqualTo(Integer value) {
            addCriterion("giftId =", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotEqualTo(Integer value) {
            addCriterion("giftId <>", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThan(Integer value) {
            addCriterion("giftId >", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftId >=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThan(Integer value) {
            addCriterion("giftId <", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThanOrEqualTo(Integer value) {
            addCriterion("giftId <=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidIn(List<Integer> values) {
            addCriterion("giftId in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotIn(List<Integer> values) {
            addCriterion("giftId not in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidBetween(Integer value1, Integer value2) {
            addCriterion("giftId between", value1, value2, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotBetween(Integer value1, Integer value2) {
            addCriterion("giftId not between", value1, value2, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIsNull() {
            addCriterion("giftNumber is null");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIsNotNull() {
            addCriterion("giftNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGiftnumberEqualTo(Integer value) {
            addCriterion("giftNumber =", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotEqualTo(Integer value) {
            addCriterion("giftNumber <>", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberGreaterThan(Integer value) {
            addCriterion("giftNumber >", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftNumber >=", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberLessThan(Integer value) {
            addCriterion("giftNumber <", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberLessThanOrEqualTo(Integer value) {
            addCriterion("giftNumber <=", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIn(List<Integer> values) {
            addCriterion("giftNumber in", values, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotIn(List<Integer> values) {
            addCriterion("giftNumber not in", values, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberBetween(Integer value1, Integer value2) {
            addCriterion("giftNumber between", value1, value2, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("giftNumber not between", value1, value2, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andMoneyidIsNull() {
            addCriterion("moneyId is null");
            return (Criteria) this;
        }

        public Criteria andMoneyidIsNotNull() {
            addCriterion("moneyId is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyidEqualTo(Integer value) {
            addCriterion("moneyId =", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidNotEqualTo(Integer value) {
            addCriterion("moneyId <>", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidGreaterThan(Integer value) {
            addCriterion("moneyId >", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moneyId >=", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidLessThan(Integer value) {
            addCriterion("moneyId <", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidLessThanOrEqualTo(Integer value) {
            addCriterion("moneyId <=", value, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidIn(List<Integer> values) {
            addCriterion("moneyId in", values, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidNotIn(List<Integer> values) {
            addCriterion("moneyId not in", values, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidBetween(Integer value1, Integer value2) {
            addCriterion("moneyId between", value1, value2, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneyidNotBetween(Integer value1, Integer value2) {
            addCriterion("moneyId not between", value1, value2, "moneyid");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIsNull() {
            addCriterion("moneyNumber is null");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIsNotNull() {
            addCriterion("moneyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMoneynumberEqualTo(Integer value) {
            addCriterion("moneyNumber =", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotEqualTo(Integer value) {
            addCriterion("moneyNumber <>", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberGreaterThan(Integer value) {
            addCriterion("moneyNumber >", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("moneyNumber >=", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberLessThan(Integer value) {
            addCriterion("moneyNumber <", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberLessThanOrEqualTo(Integer value) {
            addCriterion("moneyNumber <=", value, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberIn(List<Integer> values) {
            addCriterion("moneyNumber in", values, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotIn(List<Integer> values) {
            addCriterion("moneyNumber not in", values, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberBetween(Integer value1, Integer value2) {
            addCriterion("moneyNumber between", value1, value2, "moneynumber");
            return (Criteria) this;
        }

        public Criteria andMoneynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("moneyNumber not between", value1, value2, "moneynumber");
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