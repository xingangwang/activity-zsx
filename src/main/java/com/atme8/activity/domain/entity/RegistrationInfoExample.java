package com.atme8.activity.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class RegistrationInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected Integer limitStart;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected Integer limitEnd;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public RegistrationInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart - 1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public Integer getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
	public Integer getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
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

		public Criteria andRegIdIsNull() {
			addCriterion("reg_id is null");
			return (Criteria) this;
		}

		public Criteria andRegIdIsNotNull() {
			addCriterion("reg_id is not null");
			return (Criteria) this;
		}

		public Criteria andRegIdEqualTo(String value) {
			addCriterion("reg_id =", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotEqualTo(String value) {
			addCriterion("reg_id <>", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdGreaterThan(String value) {
			addCriterion("reg_id >", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdGreaterThanOrEqualTo(String value) {
			addCriterion("reg_id >=", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdLessThan(String value) {
			addCriterion("reg_id <", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdLessThanOrEqualTo(String value) {
			addCriterion("reg_id <=", value, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdIn(List<String> values) {
			addCriterion("reg_id in", values, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotIn(List<String> values) {
			addCriterion("reg_id not in", values, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdBetween(String value1, String value2) {
			addCriterion("reg_id between", value1, value2, "regId");
			return (Criteria) this;
		}

		public Criteria andRegIdNotBetween(String value1, String value2) {
			addCriterion("reg_id not between", value1, value2, "regId");
			return (Criteria) this;
		}

		public Criteria andFieldIdIsNull() {
			addCriterion("field_id is null");
			return (Criteria) this;
		}

		public Criteria andFieldIdIsNotNull() {
			addCriterion("field_id is not null");
			return (Criteria) this;
		}

		public Criteria andFieldIdEqualTo(String value) {
			addCriterion("field_id =", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotEqualTo(String value) {
			addCriterion("field_id <>", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdGreaterThan(String value) {
			addCriterion("field_id >", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdGreaterThanOrEqualTo(String value) {
			addCriterion("field_id >=", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdLessThan(String value) {
			addCriterion("field_id <", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdLessThanOrEqualTo(String value) {
			addCriterion("field_id <=", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdIn(List<String> values) {
			addCriterion("field_id in", values, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotIn(List<String> values) {
			addCriterion("field_id not in", values, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdBetween(String value1, String value2) {
			addCriterion("field_id between", value1, value2, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotBetween(String value1, String value2) {
			addCriterion("field_id not between", value1, value2, "fieldId");
			return (Criteria) this;
		}

		public Criteria andIsValidIsNull() {
			addCriterion("is_valid is null");
			return (Criteria) this;
		}

		public Criteria andIsValidIsNotNull() {
			addCriterion("is_valid is not null");
			return (Criteria) this;
		}

		public Criteria andIsValidEqualTo(Boolean value) {
			addCriterion("is_valid =", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidNotEqualTo(Boolean value) {
			addCriterion("is_valid <>", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidGreaterThan(Boolean value) {
			addCriterion("is_valid >", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_valid >=", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidLessThan(Boolean value) {
			addCriterion("is_valid <", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidLessThanOrEqualTo(Boolean value) {
			addCriterion("is_valid <=", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidLike(Boolean value) {
			addCriterion("is_valid like", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidNotLike(Boolean value) {
			addCriterion("is_valid not like", value, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidIn(List<Boolean> values) {
			addCriterion("is_valid in", values, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidNotIn(List<Boolean> values) {
			addCriterion("is_valid not in", values, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidBetween(Boolean value1, Boolean value2) {
			addCriterion("is_valid between", value1, value2, "isValid");
			return (Criteria) this;
		}

		public Criteria andIsValidNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_valid not between", value1, value2, "isValid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_registration_info
	 * @mbggenerated  Mon Nov 09 16:48:16 CST 2015
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_registration_info
     *
     * @mbggenerated do_not_delete_during_merge Mon Sep 07 14:31:55 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}