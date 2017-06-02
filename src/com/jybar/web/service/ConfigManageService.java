package com.jybar.web.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.jybar.web.entity.TblConfig;
import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.util.Page;



public interface ConfigManageService {
	public Page selectContentConfigList(Page page,TblConfig config) throws Exception;
	
	public  Map<String,Object> editConfig(TblConfig config) throws ParseException;
	
	public TblConfig selectByPrimaryKey(long tid);
	
	public Map<String,Object> deleteConfig(List<Long> alis) throws Exception;
	
	public Map<String,Object> findConfig(String paraName);
}
