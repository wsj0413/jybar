package com.jybar.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblBarUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public TblBarUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andUserTidIsNull() {
			addCriterion("user_tid is null");
			return (Criteria) this;
		}

		public Criteria andUserTidIsNotNull() {
			addCriterion("user_tid is not null");
			return (Criteria) this;
		}

		public Criteria andUserTidEqualTo(Long value) {
			addCriterion("user_tid =", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidNotEqualTo(Long value) {
			addCriterion("user_tid <>", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidGreaterThan(Long value) {
			addCriterion("user_tid >", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidGreaterThanOrEqualTo(Long value) {
			addCriterion("user_tid >=", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidLessThan(Long value) {
			addCriterion("user_tid <", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidLessThanOrEqualTo(Long value) {
			addCriterion("user_tid <=", value, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidIn(List<Long> values) {
			addCriterion("user_tid in", values, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidNotIn(List<Long> values) {
			addCriterion("user_tid not in", values, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidBetween(Long value1, Long value2) {
			addCriterion("user_tid between", value1, value2, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTidNotBetween(Long value1, Long value2) {
			addCriterion("user_tid not between", value1, value2, "userTid");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNull() {
			addCriterion("user_type is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull() {
			addCriterion("user_type is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(Boolean value) {
			addCriterion("user_type =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(Boolean value) {
			addCriterion("user_type <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(Boolean value) {
			addCriterion("user_type >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(Boolean value) {
			addCriterion("user_type >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(Boolean value) {
			addCriterion("user_type <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(Boolean value) {
			addCriterion("user_type <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<Boolean> values) {
			addCriterion("user_type in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<Boolean> values) {
			addCriterion("user_type not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(Boolean value1, Boolean value2) {
			addCriterion("user_type between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(Boolean value1, Boolean value2) {
			addCriterion("user_type not between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNull() {
			addCriterion("user_account is null");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNotNull() {
			addCriterion("user_account is not null");
			return (Criteria) this;
		}

		public Criteria andUserAccountEqualTo(String value) {
			addCriterion("user_account =", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotEqualTo(String value) {
			addCriterion("user_account <>", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThan(String value) {
			addCriterion("user_account >", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
			addCriterion("user_account >=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThan(String value) {
			addCriterion("user_account <", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThanOrEqualTo(String value) {
			addCriterion("user_account <=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLike(String value) {
			addCriterion("user_account like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotLike(String value) {
			addCriterion("user_account not like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountIn(List<String> values) {
			addCriterion("user_account in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotIn(List<String> values) {
			addCriterion("user_account not in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountBetween(String value1, String value2) {
			addCriterion("user_account between", value1, value2, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotBetween(String value1, String value2) {
			addCriterion("user_account not between", value1, value2,
					"userAccount");
			return (Criteria) this;
		}

		public Criteria andUserNicknameIsNull() {
			addCriterion("user_nickname is null");
			return (Criteria) this;
		}

		public Criteria andUserNicknameIsNotNull() {
			addCriterion("user_nickname is not null");
			return (Criteria) this;
		}

		public Criteria andUserNicknameEqualTo(String value) {
			addCriterion("user_nickname =", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameNotEqualTo(String value) {
			addCriterion("user_nickname <>", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameGreaterThan(String value) {
			addCriterion("user_nickname >", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
			addCriterion("user_nickname >=", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameLessThan(String value) {
			addCriterion("user_nickname <", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameLessThanOrEqualTo(String value) {
			addCriterion("user_nickname <=", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameLike(String value) {
			addCriterion("user_nickname like", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameNotLike(String value) {
			addCriterion("user_nickname not like", value, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameIn(List<String> values) {
			addCriterion("user_nickname in", values, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameNotIn(List<String> values) {
			addCriterion("user_nickname not in", values, "userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameBetween(String value1, String value2) {
			addCriterion("user_nickname between", value1, value2,
					"userNickname");
			return (Criteria) this;
		}

		public Criteria andUserNicknameNotBetween(String value1, String value2) {
			addCriterion("user_nickname not between", value1, value2,
					"userNickname");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNull() {
			addCriterion("user_password is null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNotNull() {
			addCriterion("user_password is not null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordEqualTo(String value) {
			addCriterion("user_password =", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotEqualTo(String value) {
			addCriterion("user_password <>", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThan(String value) {
			addCriterion("user_password >", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("user_password >=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThan(String value) {
			addCriterion("user_password <", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThanOrEqualTo(String value) {
			addCriterion("user_password <=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLike(String value) {
			addCriterion("user_password like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotLike(String value) {
			addCriterion("user_password not like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIn(List<String> values) {
			addCriterion("user_password in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotIn(List<String> values) {
			addCriterion("user_password not in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordBetween(String value1, String value2) {
			addCriterion("user_password between", value1, value2,
					"userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotBetween(String value1, String value2) {
			addCriterion("user_password not between", value1, value2,
					"userPassword");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyIsNull() {
			addCriterion("user_randomkey is null");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyIsNotNull() {
			addCriterion("user_randomkey is not null");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyEqualTo(String value) {
			addCriterion("user_randomkey =", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyNotEqualTo(String value) {
			addCriterion("user_randomkey <>", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyGreaterThan(String value) {
			addCriterion("user_randomkey >", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyGreaterThanOrEqualTo(String value) {
			addCriterion("user_randomkey >=", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyLessThan(String value) {
			addCriterion("user_randomkey <", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyLessThanOrEqualTo(String value) {
			addCriterion("user_randomkey <=", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyLike(String value) {
			addCriterion("user_randomkey like", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyNotLike(String value) {
			addCriterion("user_randomkey not like", value, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyIn(List<String> values) {
			addCriterion("user_randomkey in", values, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyNotIn(List<String> values) {
			addCriterion("user_randomkey not in", values, "userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyBetween(String value1, String value2) {
			addCriterion("user_randomkey between", value1, value2,
					"userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserRandomkeyNotBetween(String value1, String value2) {
			addCriterion("user_randomkey not between", value1, value2,
					"userRandomkey");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNull() {
			addCriterion("user_phone is null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNotNull() {
			addCriterion("user_phone is not null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneEqualTo(String value) {
			addCriterion("user_phone =", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotEqualTo(String value) {
			addCriterion("user_phone <>", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThan(String value) {
			addCriterion("user_phone >", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("user_phone >=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThan(String value) {
			addCriterion("user_phone <", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThanOrEqualTo(String value) {
			addCriterion("user_phone <=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLike(String value) {
			addCriterion("user_phone like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotLike(String value) {
			addCriterion("user_phone not like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIn(List<String> values) {
			addCriterion("user_phone in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotIn(List<String> values) {
			addCriterion("user_phone not in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneBetween(String value1, String value2) {
			addCriterion("user_phone between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotBetween(String value1, String value2) {
			addCriterion("user_phone not between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNull() {
			addCriterion("user_email is null");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNotNull() {
			addCriterion("user_email is not null");
			return (Criteria) this;
		}

		public Criteria andUserEmailEqualTo(String value) {
			addCriterion("user_email =", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotEqualTo(String value) {
			addCriterion("user_email <>", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThan(String value) {
			addCriterion("user_email >", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
			addCriterion("user_email >=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThan(String value) {
			addCriterion("user_email <", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThanOrEqualTo(String value) {
			addCriterion("user_email <=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLike(String value) {
			addCriterion("user_email like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotLike(String value) {
			addCriterion("user_email not like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailIn(List<String> values) {
			addCriterion("user_email in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotIn(List<String> values) {
			addCriterion("user_email not in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailBetween(String value1, String value2) {
			addCriterion("user_email between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotBetween(String value1, String value2) {
			addCriterion("user_email not between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNull() {
			addCriterion("user_status is null");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNotNull() {
			addCriterion("user_status is not null");
			return (Criteria) this;
		}

		public Criteria andUserStatusEqualTo(Boolean value) {
			addCriterion("user_status =", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotEqualTo(Boolean value) {
			addCriterion("user_status <>", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThan(Boolean value) {
			addCriterion("user_status >", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThanOrEqualTo(Boolean value) {
			addCriterion("user_status >=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThan(Boolean value) {
			addCriterion("user_status <", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThanOrEqualTo(Boolean value) {
			addCriterion("user_status <=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusIn(List<Boolean> values) {
			addCriterion("user_status in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotIn(List<Boolean> values) {
			addCriterion("user_status not in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusBetween(Boolean value1, Boolean value2) {
			addCriterion("user_status between", value1, value2, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotBetween(Boolean value1, Boolean value2) {
			addCriterion("user_status not between", value1, value2,
					"userStatus");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateIsNull() {
			addCriterion("user_createDate is null");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateIsNotNull() {
			addCriterion("user_createDate is not null");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateEqualTo(Date value) {
			addCriterionForJDBCDate("user_createDate =", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateNotEqualTo(Date value) {
			addCriterionForJDBCDate("user_createDate <>", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateGreaterThan(Date value) {
			addCriterionForJDBCDate("user_createDate >", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_createDate >=", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateLessThan(Date value) {
			addCriterionForJDBCDate("user_createDate <", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_createDate <=", value,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateIn(List<Date> values) {
			addCriterionForJDBCDate("user_createDate in", values,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateNotIn(List<Date> values) {
			addCriterionForJDBCDate("user_createDate not in", values,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_createDate between", value1, value2,
					"userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserCreatedateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_createDate not between", value1,
					value2, "userCreatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateIsNull() {
			addCriterion("user_updateDate is null");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateIsNotNull() {
			addCriterion("user_updateDate is not null");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateEqualTo(Date value) {
			addCriterionForJDBCDate("user_updateDate =", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateNotEqualTo(Date value) {
			addCriterionForJDBCDate("user_updateDate <>", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateGreaterThan(Date value) {
			addCriterionForJDBCDate("user_updateDate >", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_updateDate >=", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateLessThan(Date value) {
			addCriterionForJDBCDate("user_updateDate <", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_updateDate <=", value,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateIn(List<Date> values) {
			addCriterionForJDBCDate("user_updateDate in", values,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateNotIn(List<Date> values) {
			addCriterionForJDBCDate("user_updateDate not in", values,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_updateDate between", value1, value2,
					"userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserUpdatedateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_updateDate not between", value1,
					value2, "userUpdatedate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateIsNull() {
			addCriterion("user_lastLoginDate is null");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateIsNotNull() {
			addCriterion("user_lastLoginDate is not null");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateEqualTo(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate =", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateNotEqualTo(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate <>", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateGreaterThan(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate >", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate >=", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateLessThan(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate <", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("user_lastLoginDate <=", value,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateIn(List<Date> values) {
			addCriterionForJDBCDate("user_lastLoginDate in", values,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateNotIn(List<Date> values) {
			addCriterionForJDBCDate("user_lastLoginDate not in", values,
					"userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_lastLoginDate between", value1,
					value2, "userLastlogindate");
			return (Criteria) this;
		}

		public Criteria andUserLastlogindateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("user_lastLoginDate not between", value1,
					value2, "userLastlogindate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tblbaruser
	 * @mbggenerated  Sat Jul 05 20:13:21 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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
     * This class corresponds to the database table tblbaruser
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 04 22:41:16 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}