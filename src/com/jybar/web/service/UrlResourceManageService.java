package com.jybar.web.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.util.Page;



public interface UrlResourceManageService {
	public Page selectUrlList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception;
	
	public Page selectPlatList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception;
	
	public Page selectHotUrlList(Page page,TblUrlResource url,String startDate,String endDate) throws Exception;
	
	public  Map<String,Object> editUrl(TblUrlResource url) throws ParseException;
	
	public TblUrlResource selectByPrimaryKey(long tid);
	
	public Map<String,Object> deleteUrl(List<Long> alis)  throws Exception;
}
