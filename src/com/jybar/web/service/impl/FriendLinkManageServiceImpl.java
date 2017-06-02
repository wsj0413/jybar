package com.jybar.web.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jybar.web.entity.TblFriendLink;
import com.jybar.web.entity.TblFriendLinkExample;
import com.jybar.web.entity.TblFriendLinkExample.Criteria;
import com.jybar.web.mapper.TblFriendLinkMapper;
import com.jybar.web.service.FriendLinkManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 友情链接业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */
@Service
public class FriendLinkManageServiceImpl implements FriendLinkManageService {

	@Autowired
	private TblFriendLinkMapper mapper;
	
	
	public TblFriendLink selectByPrimaryKey(long tid){
		return mapper.selectByPrimaryKey(tid);
	}
	
	
	/**
	 * 查询文章
	 * @return
	 * @throws Exception 
	 */
	public Page selectFriList(Page page,TblFriendLink fri) throws Exception{
		TblFriendLinkExample example=new TblFriendLinkExample();
		Criteria criteria=example.createCriteria();
		/*if(CommonUtil.isNotNullorBlank(art.getAtitle())){
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
		}*/
		
		//example.setOrderByClause("createDate asc,aType asc,aOrder asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblFriendLink> alis = mapper.selectByExample(example);
		page.setResult(alis);
		return page;
	}
	
	
	
	/**
	 * Edit
	 * @return
	 * @throws ParseException 
	 */
	public  Map<String,Object> editFri(TblFriendLink fri) throws ParseException{
		if(null!=fri.getTid() && fri.getTid()>0){
			fri.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.updateByPrimaryKeySelective(fri);
			return ResultUtils.success();
		}else{
			fri.setCreatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			fri.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.insert(fri);
			return ResultUtils.success();
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteFri(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblFriendLinkExample exa= new TblFriendLinkExample();
			exa.createCriteria().andTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}


}
