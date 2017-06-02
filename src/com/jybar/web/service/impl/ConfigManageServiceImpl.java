package com.jybar.web.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jybar.web.entity.TblConfig;
import com.jybar.web.entity.TblConfigExample;
import com.jybar.web.entity.TblConfigExample.Criteria;
import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.mapper.TblConfigMapper;
import com.jybar.web.service.ConfigManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

@Service
public class ConfigManageServiceImpl implements ConfigManageService {

	@Autowired
	private TblConfigMapper mapper;
	
	
	public TblConfig selectByPrimaryKey(long tid){
		return mapper.selectByPrimaryKey(tid);
	}
	
	/**
	 * 查询内容配置
	 * @return
	 * @throws Exception 
	 */
	public Page selectContentConfigList(Page page,TblConfig config) throws Exception{
		TblConfigExample example=new TblConfigExample();
		Criteria criteria=example.createCriteria();
		if(CommonUtil.isNotNullorBlank(config.getParaname())){
			criteria.andParanameLike("%"+config.getParaname()+"%");
		}
		if(CommonUtil.isNotNullorBlank(config.getParakey())){
			criteria.andParakeyLike("%"+config.getParakey()+"%");
		}
		if(CommonUtil.isNotNullorBlank(config.getParavalue())){
			criteria.andParavalueLike("%"+config.getParavalue()+"%");
		}
		if(CommonUtil.isNotNullorBlank(config.getContent())){
			criteria.andContentLike("%"+config.getContent()+"%");
		}
		
		
		example.setOrderByClause("paraName asc,paraKey asc");
		page.setCount(mapper.countByExample(example));
		example.setLimitStart(page.getBegin());
		example.setLimitEnd(page.getLength());
		List<TblConfig> alis = mapper.selectByExample(example);
		page.setResult(alis);
		return page;
	}
	
	
	
	/**
	 * Edit
	 * @return
	 * @throws ParseException 
	 */
	public  Map<String,Object> editConfig(TblConfig config) throws ParseException{
		if(null!=config.getTid() && config.getTid()>0){
			mapper.updateByPrimaryKey(config);
			return ResultUtils.success();
		}else{
			mapper.insert(config);
			return ResultUtils.success();
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteConfig(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblConfigExample exa= new TblConfigExample();
			exa.createCriteria().andTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}

	@Override
	public Map<String,Object> findConfig(String paraName) {
		if(CommonUtil.isNotNullorBlank(paraName)){
			TblConfigExample exa=new TblConfigExample();
			exa.createCriteria().andParanameEqualTo(paraName);
			return ResultUtils.success(ResultUtils.RESULT_CODE_SUCCESS, "configLis", mapper.selectByExample(exa));
		}else{
			return ResultUtils.fail("需要查询的参数为空");
		}
	}

}
