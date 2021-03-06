package com.jybar.web.entity;

import java.util.Date;

public class TblArticle {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.tid
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Long tid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aTitle
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String atitle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aTag
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String atag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aType
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String atype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aStructure
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Integer astructure;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aSource
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String asource;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Long ashowcount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aTrueShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Long atrueshowcount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aStatus
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Integer astatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aAuthorName
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String aauthorname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aAuthor
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String aauthor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aImage
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Long aimage;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.isIndex
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Integer isindex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aOrder
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Long aorder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.createDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Date createdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.updateDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private Date updatedate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tblarticle.aContent
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	private String acontent;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.tid
	 * @return  the value of tblarticle.tid
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Long getTid() {
		return tid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.tid
	 * @param tid  the value for tblarticle.tid
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setTid(Long tid) {
		this.tid = tid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aTitle
	 * @return  the value of tblarticle.aTitle
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAtitle() {
		return atitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aTitle
	 * @param atitle  the value for tblarticle.aTitle
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAtitle(String atitle) {
		this.atitle = atitle == null ? null : atitle.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aTag
	 * @return  the value of tblarticle.aTag
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAtag() {
		return atag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aTag
	 * @param atag  the value for tblarticle.aTag
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAtag(String atag) {
		this.atag = atag == null ? null : atag.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aType
	 * @return  the value of tblarticle.aType
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAtype() {
		return atype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aType
	 * @param atype  the value for tblarticle.aType
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAtype(String atype) {
		this.atype = atype == null ? null : atype.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aStructure
	 * @return  the value of tblarticle.aStructure
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Integer getAstructure() {
		return astructure;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aStructure
	 * @param astructure  the value for tblarticle.aStructure
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAstructure(Integer astructure) {
		this.astructure = astructure;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aSource
	 * @return  the value of tblarticle.aSource
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAsource() {
		return asource;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aSource
	 * @param asource  the value for tblarticle.aSource
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAsource(String asource) {
		this.asource = asource == null ? null : asource.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aShowCount
	 * @return  the value of tblarticle.aShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Long getAshowcount() {
		return ashowcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aShowCount
	 * @param ashowcount  the value for tblarticle.aShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAshowcount(Long ashowcount) {
		this.ashowcount = ashowcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aTrueShowCount
	 * @return  the value of tblarticle.aTrueShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Long getAtrueshowcount() {
		return atrueshowcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aTrueShowCount
	 * @param atrueshowcount  the value for tblarticle.aTrueShowCount
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAtrueshowcount(Long atrueshowcount) {
		this.atrueshowcount = atrueshowcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aStatus
	 * @return  the value of tblarticle.aStatus
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Integer getAstatus() {
		return astatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aStatus
	 * @param astatus  the value for tblarticle.aStatus
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAstatus(Integer astatus) {
		this.astatus = astatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aAuthorName
	 * @return  the value of tblarticle.aAuthorName
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAauthorname() {
		return aauthorname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aAuthorName
	 * @param aauthorname  the value for tblarticle.aAuthorName
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAauthorname(String aauthorname) {
		this.aauthorname = aauthorname == null ? null : aauthorname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aAuthor
	 * @return  the value of tblarticle.aAuthor
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAauthor() {
		return aauthor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aAuthor
	 * @param aauthor  the value for tblarticle.aAuthor
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAauthor(String aauthor) {
		this.aauthor = aauthor == null ? null : aauthor.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aImage
	 * @return  the value of tblarticle.aImage
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Long getAimage() {
		return aimage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aImage
	 * @param aimage  the value for tblarticle.aImage
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAimage(Long aimage) {
		this.aimage = aimage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.isIndex
	 * @return  the value of tblarticle.isIndex
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Integer getIsindex() {
		return isindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.isIndex
	 * @param isindex  the value for tblarticle.isIndex
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setIsindex(Integer isindex) {
		this.isindex = isindex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aOrder
	 * @return  the value of tblarticle.aOrder
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Long getAorder() {
		return aorder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aOrder
	 * @param aorder  the value for tblarticle.aOrder
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAorder(Long aorder) {
		this.aorder = aorder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.createDate
	 * @return  the value of tblarticle.createDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.createDate
	 * @param createdate  the value for tblarticle.createDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.updateDate
	 * @return  the value of tblarticle.updateDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public Date getUpdatedate() {
		return updatedate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.updateDate
	 * @param updatedate  the value for tblarticle.updateDate
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tblarticle.aContent
	 * @return  the value of tblarticle.aContent
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public String getAcontent() {
		return acontent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tblarticle.aContent
	 * @param acontent  the value for tblarticle.aContent
	 * @mbggenerated  Sun Sep 07 22:38:26 CST 2014
	 */
	public void setAcontent(String acontent) {
		this.acontent = acontent == null ? null : acontent.trim();
	}
}