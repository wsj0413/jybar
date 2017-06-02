package com.jybar.web.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jybar.web.entity.TblArticle;
import com.jybar.web.entity.TblArticleExample;
import com.jybar.web.entity.TblArticleExample.Criteria;
import com.jybar.web.entity.TblArticle;
import com.jybar.web.mapper.TblArticleMapper;
import com.jybar.web.service.ArticleManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 文章(内容)业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */
@Service
public class ArticleManageServiceImpl implements ArticleManageService {

	@Autowired
	private TblArticleMapper mapper;
	
	
	public TblArticle selectByPrimaryKey(long tid){
		return mapper.selectByPrimaryKey(tid);
	}
	
	
	/**
	 * 查询文章
	 * @return
	 * @throws Exception 
	 */
	public Page selectArtList(Page page,TblArticle art) throws Exception{
		TblArticleExample example=new TblArticleExample();
		Criteria criteria=example.createCriteria();
		if(CommonUtil.isNotNullorBlank(art.getAtitle())){
			criteria.andAtitleLike("%"+art.getAtitle()+"%");
		}
		if(CommonUtil.isNotNullorBlank(art.getAsource())){
			criteria.andAsourceLike("%"+art.getAsource()+"%");
		}
		if(CommonUtil.isNotNullorBlank(art.getAauthor())){
			criteria.andAauthorLike("%"+art.getAauthor()+"%").andAauthornameLike("%"+art.getAauthorname()+"%");
		}
		if(null!=art.getAstructure() && art.getAstructure()!=-1){
			criteria.andAstructureEqualTo(art.getAstructure());
		}
		if(CommonUtil.isNotNullorBlank(art.getAtype()) && !art.getAtype().equals("-1")){
			criteria.andAtypeEqualTo(art.getAtype());
		}
		if(null!=art.getIsindex() && art.getIsindex()!=-1){
			criteria.andIsindexEqualTo(art.getIsindex());
		}
		if(CommonUtil.isNotNullorBlank(art.getAtag())){
			criteria.andAtagLike("%"+art.getAtag()+"%");
		}
		
		example.setOrderByClause("createDate asc,aType asc,aOrder asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblArticle> alis = mapper.selectByExampleWithBLOBs(example);
		page.setResult(alis);
		return page;
	}
	
	
	
	/**
	 * Edit
	 * @return
	 * @throws ParseException 
	 */
	public  Map<String,Object> editArt(TblArticle art) throws ParseException{
		if(null!=art.getTid() && art.getTid()>0){
			art.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.updateByPrimaryKeySelective(art);
			return ResultUtils.success();
		}else{
			art.setAstatus(CommonFinal.ARTICLE_STATUS_SHOW);
			art.setAtrueshowcount((long)0);
			art.setCreatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			art.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.insert(art);
			return ResultUtils.success();
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteArt(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblArticleExample exa= new TblArticleExample();
			exa.createCriteria().andTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}


}
