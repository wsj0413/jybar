package com.jybar.web.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jybar.web.entity.TblBarUser;
import com.jybar.web.entity.TblBarUserExample;
import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.entity.TblUrlResourceExample;
import com.jybar.web.entity.TblUrlResourceExample.Criteria;
import com.jybar.web.mapper.TblUrlResourceMapper;
import com.jybar.web.service.UrlResourceManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

@Service
public class UrlResourceUserManageServiceImpl implements UrlResourceManageService {

	@Autowired
	private TblUrlResourceMapper mapper;
	
	
	public TblUrlResource selectByPrimaryKey(long tid){
		return mapper.selectByPrimaryKey(tid);
	}
	
	/**
	 * 查询所有的导航资源
	 * @return
	 * @throws Exception 
	 */
	public Page selectUrlList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception{
		TblUrlResourceExample example=new TblUrlResourceExample();
		Criteria criteria=example.createCriteria();
		if(null!=url.getUrlname() && !"".equals(url.getUrlname())){
			criteria.andUrlnameLike("%"+url.getUrlname()+"%");
		}
		if(null != url.getUrl() && !"".equals(url.getUrl()) ){
			criteria.andUrlLike("%"+url.getUrl()+"%");
		}
		if(null != url.getUrltype() && url.getUrltype()!=-1){
			criteria.andUrltypeEqualTo(url.getUrltype());
		}else{
			criteria.andUrltypeNotEqualTo(CommonFinal.URLRESOURCE_PLATFORMREC);
			criteria.andUrltypeNotEqualTo(CommonFinal.URLRESOURCE_HOTURL);
		}
		if(null != url.getUrlstatus() && url.getUrlstatus()!=-1 ){
			criteria.andUrlstatusEqualTo(url.getUrlstatus());
		}
		if(null != url.getIsshowindex() && url.getIsshowindex()!=-1 ){
			criteria.andUrlstatusEqualTo(url.getIsshowindex());
		}
		if(!"".equals(startDate)  && !"".equals(endDate)){
			criteria.andCreatedateBetween(CommonUtil.sdf.parse(startDate),CommonUtil.sdf.parse( endDate));
		}
		
		example.setOrderByClause("urlType asc,urlOrder asc,isShowIndex asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblUrlResource> alis = mapper.selectByExample(example);
		page.setResult(alis);
		return page;
	}
	
	/**
	 * 查询所有的平台推荐资源
	 * @return
	 * @throws Exception 
	 */
	public Page selectPlatList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception{
		TblUrlResourceExample example=new TblUrlResourceExample();
		Criteria criteria=example.createCriteria();
		if(null!=url.getUrlname() && !"".equals(url.getUrlname())){
			criteria.andUrlnameLike("%"+url.getUrlname()+"%");
		}
		if(null != url.getUrl() && !"".equals(url.getUrl()) ){
			criteria.andUrlLike("%"+url.getUrl()+"%");
		}
		criteria.andUrltypeEqualTo(CommonFinal.URLRESOURCE_PLATFORMREC);
		if(null != url.getUrlstatus() && url.getUrlstatus()!=-1 ){
			criteria.andUrlstatusEqualTo(url.getUrlstatus());
		}
		if(!"".equals(startDate)  && !"".equals(endDate)){
			criteria.andCreatedateBetween(CommonUtil.sdf.parse(startDate),CommonUtil.sdf.parse( endDate));
		}
		
		example.setOrderByClause("urlOrder asc,sortWeight asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblUrlResource> alis = mapper.selectByExample(example);
		page.setResult(alis);
		return page;
	}
	
	/**
	 * 查询所有的热门导航资源
	 * @return
	 * @throws Exception 
	 */
	public Page selectHotUrlList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception{
		TblUrlResourceExample example=new TblUrlResourceExample();
		Criteria criteria=example.createCriteria();
		if(null!=url.getUrlname() && !"".equals(url.getUrlname())){
			criteria.andUrlnameLike("%"+url.getUrlname()+"%");
		}
		if(null != url.getUrl() && !"".equals(url.getUrl()) ){
			criteria.andUrlLike("%"+url.getUrl()+"%");
		}
		criteria.andUrltypeEqualTo(CommonFinal.URLRESOURCE_HOTURL);
		if(null != url.getUrlstatus() && url.getUrlstatus()!=-1 ){
			criteria.andUrlstatusEqualTo(url.getUrlstatus());
		}
		if(!"".equals(startDate)  && !"".equals(endDate)){
			criteria.andCreatedateBetween(CommonUtil.sdf.parse(startDate),CommonUtil.sdf.parse( endDate));
		}
		
		example.setOrderByClause("urlOrder asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblUrlResource> alis = mapper.selectByExample(example);
		page.setResult(alis);
		return page;
	}
	
	/**
	 * 查询所有的资源
	 * @return
	 * @throws ParseException 
	 */
	public  Map<String,Object> editUrl(TblUrlResource url) throws ParseException{
		if(null!=url.getTid() && url.getTid()>0){
			TblUrlResource oldUrl=mapper.selectByPrimaryKey(url.getTid());
			url.setClickcounttrue(oldUrl.getClickcounttrue());
			url.setCreatedate(oldUrl.getCreatedate());
			url.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.updateByPrimaryKey(url);
			return ResultUtils.success();
		}else{
			url.setCreatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			url.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.insert(url);
			return ResultUtils.success();
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteUrl(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblUrlResourceExample exa= new TblUrlResourceExample();
			exa.createCriteria().andTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}
	
}
