package com.jybar.web.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.jybar.web.entity.TblArticle;
import com.jybar.web.entity.TblImage;
import com.jybar.web.util.Page;

/**
 * 文章(内容)业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */

public interface ImageManageService {
	
	public  Map<String,Object> editImg(TblImage art) throws ParseException;
	
	public TblImage selectByPrimaryKey(long tid);
	
	public Map<String,Object> deleteImg(List<Long> alis)  throws Exception;
}
