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
import com.jybar.web.entity.TblImage;
import com.jybar.web.entity.TblImageExample;
import com.jybar.web.mapper.TblImageMapper;
import com.jybar.web.service.ImageManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 图片业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */
@Service
public class ImageManageServiceImpl implements ImageManageService {

	@Autowired
	private TblImageMapper mapper;
	
	
	public TblImage selectByPrimaryKey(long tid){
		return mapper.selectByPrimaryKey(tid);
	}
	
	
	
	/**
	 * Edit
	 * @return
	 * @throws ParseException 
	 */
	public  Map<String,Object> editImg(TblImage img) throws ParseException{
		if(null!=img.getTid() && img.getTid()>0){
			
			return ResultUtils.success("tid", mapper.updateByPrimaryKey(img));
		}else{
			img.setCreatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			img.setUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
			mapper.insertSelective(img);
			return ResultUtils.success("tid",img.getTid());
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteImg(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblImageExample exa= new TblImageExample();
			exa.createCriteria().andTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}


}
