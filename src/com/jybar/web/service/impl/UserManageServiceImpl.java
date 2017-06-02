package com.jybar.web.service.impl;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jybar.web.entity.TblBarUser;
import com.jybar.web.entity.TblBarUserExample;
import com.jybar.web.mapper.TblBarUserMapper;
import com.jybar.web.service.UserManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.MD5;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

@Service
public class UserManageServiceImpl implements UserManageService {

	@Autowired
	private TblBarUserMapper mapper;

	
	public TblBarUser selectByPrimaryKey(long id){
		return mapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据账户和密码得到用户信息
	 * @param account
	 * @param pswd
	 * @return
	 */
	private TblBarUser selectByAccountAndPswd(String account,String pswd,int type){
		return mapper.selectByAccountAndPswd(account, pswd,type);
	}
	
	/**
	 * 根据账户和用户类型得到密匙
	 * @param account
	 * @param type
	 * @return
	 */
	public String selectRandomkeyByAccountAndType(String account,int type){
		return mapper.selectRandomkeyByAccountAndType(account, type);
	}
	
	/**
	 * 后台登录查询
	 * @param account
	 * @param pswd
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public Map<String,Object> selectUserForManage(String account,String pswd) throws NoSuchAlgorithmException{
		String randomkey=selectRandomkeyByAccountAndType(account, CommonFinal.BARUSER_TYPE_MANAGE);
		if(CommonUtil.isNotNullorBlank(randomkey)){
			pswd=MD5.getMd5(pswd, randomkey);
			TblBarUser user = selectByAccountAndPswd(account, pswd,CommonFinal.BARUSER_TYPE_MANAGE);
			if(null != user){
				return ResultUtils.success("user", user);
			}
			return ResultUtils.fail("账号或密码错误");
		}else{
			return ResultUtils.fail("用户不存在");
		}
	}
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public Page selectUserList(Page page){
		List<TblBarUser> alis = mapper.selectByExample(null);
		page.setResult(alis);
		return page;
	}
	
	/**
	 * 添加用户信息
	 * @param user  用户对象
	 * @param reuserPassword  重复密码
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws ParseException 
	 */
	public Map<String,Object> addUser(TblBarUser user,String reuserPassword,long userId) throws Exception{
		if(user.getUserPassword().equals(reuserPassword)){
			if(userId>0){
				user.setUserUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
				mapper.updateByPrimaryKey(user);
				return ResultUtils.success();
			}else{
				if(!CommonUtil.isNotNullorBlank(selectRandomkeyByAccountAndType(user.getUserAccount(), user.getUserType()) )){
					String randomKey= CommonUtil.generateRandomkey();
					user.setUserPassword(MD5.getMd5(user.getUserPassword(), randomKey));
					user.setUserRandomkey(randomKey);
					
					user.setUserCreatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
					user.setUserUpdatedate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
					user.setUserLastlogindate(CommonUtil.sdf.parse(CommonUtil.sdf.format(new Date())));
					mapper.insert(user);
					return ResultUtils.success();
				}else{
					return ResultUtils.fail("用户名已经存在");
				}
			}
			
		}else{
			return ResultUtils.fail("请确认密码两次输入相同");
		}
	}
	
	/**
	 * 删除数据
	 * @param alis
	 * @return
	 */
	public Map<String,Object> deleteUser(List<Long> alis)  throws Exception{
		if(null!=alis){
			TblBarUserExample exa= new TblBarUserExample();
			exa.createCriteria().andUserTidIn(alis);
			mapper.deleteByExample(exa);
			return ResultUtils.success();
		}else{
			return ResultUtils.fail("请选择要删除的数据");
		}
		
	}
	
}
