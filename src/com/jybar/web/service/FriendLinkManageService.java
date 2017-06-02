package com.jybar.web.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.jybar.web.entity.TblFriendLink;
import com.jybar.web.util.Page;

/**
 * 友情链接业务逻辑类
 * @author 封程中 2014年8月27日 21:45:06
 *
 */

public interface FriendLinkManageService {
	public Page selectFriList(Page page,TblFriendLink fri) throws Exception;
	
	public  Map<String,Object> editFri(TblFriendLink fri) throws ParseException;
	
	public TblFriendLink selectByPrimaryKey(long tid);
	
	public Map<String,Object> deleteFri(List<Long> alis)  throws Exception;
}
