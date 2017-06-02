package com.jybar.web.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

import com.jybar.web.entity.TblBarUser;
import com.jybar.web.util.Page;


public interface UserManageService {
	public TblBarUser selectByPrimaryKey(long id);
	/**
	 * 后台登录查询
	 * @param account
	 * @param pswd
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public Map<String,Object> selectUserForManage(String account,String pswd) throws NoSuchAlgorithmException;
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public Page selectUserList(Page page);
	
	/**
	 * 根据账户和用户类型得到密匙
	 * @param account
	 * @param type
	 * @return
	 */
	public String selectRandomkeyByAccountAndType(String account,int type);
	
	/**
	 * 添加用户信息
	 * @param user  用户对象
	 * @param reuserPassword  重复密码
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public Map<String,Object> addUser(TblBarUser user,String reuserPassword,long userId) throws Exception;
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteUser(List<Long> alis)  throws Exception;
}
