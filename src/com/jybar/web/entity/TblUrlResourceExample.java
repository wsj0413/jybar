package com.jybar.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblUrlResourceExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected Integer limitStart;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected Integer limitEnd;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public TblUrlResourceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public Integer getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
	 */
	public Integer getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
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

		public Criteria andTidIsNull() {
			addCriterion("tid is null");
			return (Criteria) this;
		}

		public Criteria andTidIsNotNull() {
			addCriterion("tid is not null");
			return (Criteria) this;
		}

		public Criteria andTidEqualTo(Long value) {
			addCriterion("tid =", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotEqualTo(Long value) {
			addCriterion("tid <>", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThan(Long value) {
			addCriterion("tid >", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThanOrEqualTo(Long value) {
			addCriterion("tid >=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThan(Long value) {
			addCriterion("tid <", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThanOrEqualTo(Long value) {
			addCriterion("tid <=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidIn(List<Long> values) {
			addCriterion("tid in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotIn(List<Long> values) {
			addCriterion("tid not in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidBetween(Long value1, Long value2) {
			addCriterion("tid between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotBetween(Long value1, Long value2) {
			addCriterion("tid not between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andUrltypeIsNull() {
			addCriterion("urlType is null");
			return (Criteria) this;
		}

		public Criteria andUrltypeIsNotNull() {
			addCriterion("urlType is not null");
			return (Criteria) this;
		}

		public Criteria andUrltypeEqualTo(Integer value) {
			addCriterion("urlType =", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeNotEqualTo(Integer value) {
			addCriterion("urlType <>", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeGreaterThan(Integer value) {
			addCriterion("urlType >", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("urlType >=", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeLessThan(Integer value) {
			addCriterion("urlType <", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeLessThanOrEqualTo(Integer value) {
			addCriterion("urlType <=", value, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeIn(List<Integer> values) {
			addCriterion("urlType in", values, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeNotIn(List<Integer> values) {
			addCriterion("urlType not in", values, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeBetween(Integer value1, Integer value2) {
			addCriterion("urlType between", value1, value2, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrltypeNotBetween(Integer value1, Integer value2) {
			addCriterion("urlType not between", value1, value2, "urltype");
			return (Criteria) this;
		}

		public Criteria andUrlnameIsNull() {
			addCriterion("urlName is null");
			return (Criteria) this;
		}

		public Criteria andUrlnameIsNotNull() {
			addCriterion("urlName is not null");
			return (Criteria) this;
		}

		public Criteria andUrlnameEqualTo(String value) {
			addCriterion("urlName =", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameNotEqualTo(String value) {
			addCriterion("urlName <>", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameGreaterThan(String value) {
			addCriterion("urlName >", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameGreaterThanOrEqualTo(String value) {
			addCriterion("urlName >=", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameLessThan(String value) {
			addCriterion("urlName <", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameLessThanOrEqualTo(String value) {
			addCriterion("urlName <=", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameLike(String value) {
			addCriterion("urlName like", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameNotLike(String value) {
			addCriterion("urlName not like", value, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameIn(List<String> values) {
			addCriterion("urlName in", values, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameNotIn(List<String> values) {
			addCriterion("urlName not in", values, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameBetween(String value1, String value2) {
			addCriterion("urlName between", value1, value2, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlnameNotBetween(String value1, String value2) {
			addCriterion("urlName not between", value1, value2, "urlname");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlstatusIsNull() {
			addCriterion("urlStatus is null");
			return (Criteria) this;
		}

		public Criteria andUrlstatusIsNotNull() {
			addCriterion("urlStatus is not null");
			return (Criteria) this;
		}

		public Criteria andUrlstatusEqualTo(Integer value) {
			addCriterion("urlStatus =", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusNotEqualTo(Integer value) {
			addCriterion("urlStatus <>", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusGreaterThan(Integer value) {
			addCriterion("urlStatus >", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("urlStatus >=", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusLessThan(Integer value) {
			addCriterion("urlStatus <", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusLessThanOrEqualTo(Integer value) {
			addCriterion("urlStatus <=", value, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusIn(List<Integer> values) {
			addCriterion("urlStatus in", values, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusNotIn(List<Integer> values) {
			addCriterion("urlStatus not in", values, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusBetween(Integer value1, Integer value2) {
			addCriterion("urlStatus between", value1, value2, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlstatusNotBetween(Integer value1, Integer value2) {
			addCriterion("urlStatus not between", value1, value2, "urlstatus");
			return (Criteria) this;
		}

		public Criteria andUrlorderIsNull() {
			addCriterion("urlOrder is null");
			return (Criteria) this;
		}

		public Criteria andUrlorderIsNotNull() {
			addCriterion("urlOrder is not null");
			return (Criteria) this;
		}

		public Criteria andUrlorderEqualTo(Integer value) {
			addCriterion("urlOrder =", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderNotEqualTo(Integer value) {
			addCriterion("urlOrder <>", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderGreaterThan(Integer value) {
			addCriterion("urlOrder >", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderGreaterThanOrEqualTo(Integer value) {
			addCriterion("urlOrder >=", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderLessThan(Integer value) {
			addCriterion("urlOrder <", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderLessThanOrEqualTo(Integer value) {
			addCriterion("urlOrder <=", value, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderIn(List<Integer> values) {
			addCriterion("urlOrder in", values, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderNotIn(List<Integer> values) {
			addCriterion("urlOrder not in", values, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderBetween(Integer value1, Integer value2) {
			addCriterion("urlOrder between", value1, value2, "urlorder");
			return (Criteria) this;
		}

		public Criteria andUrlorderNotBetween(Integer value1, Integer value2) {
			addCriterion("urlOrder not between", value1, value2, "urlorder");
			return (Criteria) this;
		}

		public Criteria andSortweightIsNull() {
			addCriterion("sortWeight is null");
			return (Criteria) this;
		}

		public Criteria andSortweightIsNotNull() {
			addCriterion("sortWeight is not null");
			return (Criteria) this;
		}

		public Criteria andSortweightEqualTo(Integer value) {
			addCriterion("sortWeight =", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightNotEqualTo(Integer value) {
			addCriterion("sortWeight <>", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightGreaterThan(Integer value) {
			addCriterion("sortWeight >", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightGreaterThanOrEqualTo(Integer value) {
			addCriterion("sortWeight >=", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightLessThan(Integer value) {
			addCriterion("sortWeight <", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightLessThanOrEqualTo(Integer value) {
			addCriterion("sortWeight <=", value, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightIn(List<Integer> values) {
			addCriterion("sortWeight in", values, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightNotIn(List<Integer> values) {
			addCriterion("sortWeight not in", values, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightBetween(Integer value1, Integer value2) {
			addCriterion("sortWeight between", value1, value2, "sortweight");
			return (Criteria) this;
		}

		public Criteria andSortweightNotBetween(Integer value1, Integer value2) {
			addCriterion("sortWeight not between", value1, value2, "sortweight");
			return (Criteria) this;
		}

		public Criteria andIsshowindexIsNull() {
			addCriterion("isShowIndex is null");
			return (Criteria) this;
		}

		public Criteria andIsshowindexIsNotNull() {
			addCriterion("isShowIndex is not null");
			return (Criteria) this;
		}

		public Criteria andIsshowindexEqualTo(Integer value) {
			addCriterion("isShowIndex =", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexNotEqualTo(Integer value) {
			addCriterion("isShowIndex <>", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexGreaterThan(Integer value) {
			addCriterion("isShowIndex >", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexGreaterThanOrEqualTo(Integer value) {
			addCriterion("isShowIndex >=", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexLessThan(Integer value) {
			addCriterion("isShowIndex <", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexLessThanOrEqualTo(Integer value) {
			addCriterion("isShowIndex <=", value, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexIn(List<Integer> values) {
			addCriterion("isShowIndex in", values, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexNotIn(List<Integer> values) {
			addCriterion("isShowIndex not in", values, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexBetween(Integer value1, Integer value2) {
			addCriterion("isShowIndex between", value1, value2, "isshowindex");
			return (Criteria) this;
		}

		public Criteria andIsshowindexNotBetween(Integer value1, Integer value2) {
			addCriterion("isShowIndex not between", value1, value2,
					"isshowindex");
			return (Criteria) this;
		}

		public Criteria andClickcountIsNull() {
			addCriterion("clickCount is null");
			return (Criteria) this;
		}

		public Criteria andClickcountIsNotNull() {
			addCriterion("clickCount is not null");
			return (Criteria) this;
		}

		public Criteria andClickcountEqualTo(Long value) {
			addCriterion("clickCount =", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountNotEqualTo(Long value) {
			addCriterion("clickCount <>", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountGreaterThan(Long value) {
			addCriterion("clickCount >", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountGreaterThanOrEqualTo(Long value) {
			addCriterion("clickCount >=", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountLessThan(Long value) {
			addCriterion("clickCount <", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountLessThanOrEqualTo(Long value) {
			addCriterion("clickCount <=", value, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountIn(List<Long> values) {
			addCriterion("clickCount in", values, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountNotIn(List<Long> values) {
			addCriterion("clickCount not in", values, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountBetween(Long value1, Long value2) {
			addCriterion("clickCount between", value1, value2, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcountNotBetween(Long value1, Long value2) {
			addCriterion("clickCount not between", value1, value2, "clickcount");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueIsNull() {
			addCriterion("clickCountTrue is null");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueIsNotNull() {
			addCriterion("clickCountTrue is not null");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueEqualTo(Long value) {
			addCriterion("clickCountTrue =", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueNotEqualTo(Long value) {
			addCriterion("clickCountTrue <>", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueGreaterThan(Long value) {
			addCriterion("clickCountTrue >", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueGreaterThanOrEqualTo(Long value) {
			addCriterion("clickCountTrue >=", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueLessThan(Long value) {
			addCriterion("clickCountTrue <", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueLessThanOrEqualTo(Long value) {
			addCriterion("clickCountTrue <=", value, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueIn(List<Long> values) {
			addCriterion("clickCountTrue in", values, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueNotIn(List<Long> values) {
			addCriterion("clickCountTrue not in", values, "clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueBetween(Long value1, Long value2) {
			addCriterion("clickCountTrue between", value1, value2,
					"clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickcounttrueNotBetween(Long value1, Long value2) {
			addCriterion("clickCountTrue not between", value1, value2,
					"clickcounttrue");
			return (Criteria) this;
		}

		public Criteria andClickorderIsNull() {
			addCriterion("clickOrder is null");
			return (Criteria) this;
		}

		public Criteria andClickorderIsNotNull() {
			addCriterion("clickOrder is not null");
			return (Criteria) this;
		}

		public Criteria andClickorderEqualTo(Integer value) {
			addCriterion("clickOrder =", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderNotEqualTo(Integer value) {
			addCriterion("clickOrder <>", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderGreaterThan(Integer value) {
			addCriterion("clickOrder >", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderGreaterThanOrEqualTo(Integer value) {
			addCriterion("clickOrder >=", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderLessThan(Integer value) {
			addCriterion("clickOrder <", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderLessThanOrEqualTo(Integer value) {
			addCriterion("clickOrder <=", value, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderIn(List<Integer> values) {
			addCriterion("clickOrder in", values, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderNotIn(List<Integer> values) {
			addCriterion("clickOrder not in", values, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderBetween(Integer value1, Integer value2) {
			addCriterion("clickOrder between", value1, value2, "clickorder");
			return (Criteria) this;
		}

		public Criteria andClickorderNotBetween(Integer value1, Integer value2) {
			addCriterion("clickOrder not between", value1, value2, "clickorder");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNull() {
			addCriterion("createDate is null");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("createDate is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterion("createDate =", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterion("createDate <>", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterion("createDate >", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("createDate >=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterion("createDate <", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterion("createDate <=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIn(List<Date> values) {
			addCriterion("createDate in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotIn(List<Date> values) {
			addCriterion("createDate not in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterion("createDate between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterion("createDate not between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIsNull() {
			addCriterion("updateDate is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIsNotNull() {
			addCriterion("updateDate is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedateEqualTo(Date value) {
			addCriterion("updateDate =", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotEqualTo(Date value) {
			addCriterion("updateDate <>", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateGreaterThan(Date value) {
			addCriterion("updateDate >", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("updateDate >=", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateLessThan(Date value) {
			addCriterion("updateDate <", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
			addCriterion("updateDate <=", value, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateIn(List<Date> values) {
			addCriterion("updateDate in", values, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotIn(List<Date> values) {
			addCriterion("updateDate not in", values, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateBetween(Date value1, Date value2) {
			addCriterion("updateDate between", value1, value2, "updatedate");
			return (Criteria) this;
		}

		public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
			addCriterion("updateDate not between", value1, value2, "updatedate");
			return (Criteria) this;
		}

		public Criteria andIsredIsNull() {
			addCriterion("isRed is null");
			return (Criteria) this;
		}

		public Criteria andIsredIsNotNull() {
			addCriterion("isRed is not null");
			return (Criteria) this;
		}

		public Criteria andIsredEqualTo(Integer value) {
			addCriterion("isRed =", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredNotEqualTo(Integer value) {
			addCriterion("isRed <>", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredGreaterThan(Integer value) {
			addCriterion("isRed >", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredGreaterThanOrEqualTo(Integer value) {
			addCriterion("isRed >=", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredLessThan(Integer value) {
			addCriterion("isRed <", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredLessThanOrEqualTo(Integer value) {
			addCriterion("isRed <=", value, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredIn(List<Integer> values) {
			addCriterion("isRed in", values, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredNotIn(List<Integer> values) {
			addCriterion("isRed not in", values, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredBetween(Integer value1, Integer value2) {
			addCriterion("isRed between", value1, value2, "isred");
			return (Criteria) this;
		}

		public Criteria andIsredNotBetween(Integer value1, Integer value2) {
			addCriterion("isRed not between", value1, value2, "isred");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tblurlresource
	 * @mbggenerated  Sun Aug 24 22:57:48 CST 2014
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
     * This class corresponds to the database table tblurlresource
     *
     * @mbggenerated do_not_delete_during_merge Sun Aug 03 22:16:22 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}