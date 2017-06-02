package com.jybar.web.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.jybar.web.entity.TblArticle;
import com.jybar.web.util.Page;

/**
 * 文章(内容)业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */

public interface ArticleManageService {
	public Page selectArtList(Page page,TblArticle art) throws Exception;
	
	public  Map<String,Object> editArt(TblArticle art) throws ParseException;
	
	public TblArticle selectByPrimaryKey(long tid);
	
	public Map<String,Object> deleteArt(List<Long> alis)  throws Exception;
}
