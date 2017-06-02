package com.jybar.web.controller.manage;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jybar.web.entity.TblBarUser;
import com.jybar.web.service.UserManageService;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.RandomValidateCode;


@Controller
@RequestMapping(value="/manage/login")
public class LoginController {
	Logger log  =  Logger.getLogger(LoginController. class );
	
	@Autowired
	private UserManageService service;
	
	@RequestMapping(value = "")
	public ModelAndView login(Model model,HttpSession session){
		if(null == session.getAttribute("manage_user")){
			return new ModelAndView("manage/login");
		}else{
			//TODO 直接登录
			return new ModelAndView("redirect:/manage/index.do");  
		}
	}
	
	@RequestMapping(value = "/checkLogin")
	public String checkLogin(Model model,@RequestParam("account")String account,@RequestParam("pwd")String pwd,@RequestParam("checkNum")String checkNum,HttpSession session){
		String errMsg = "";
		String randomCodekey=session.getAttribute(RandomValidateCode.RANDOMCODEKEY) == null ? "" : session.getAttribute(RandomValidateCode.RANDOMCODEKEY).toString();
		if(CommonUtil.isNotNullorBlank(randomCodekey) && randomCodekey.equalsIgnoreCase(checkNum)){
			try {
				Map<String,Object> map =service.selectUserForManage(account,pwd);
				int resultCode = (Integer)map.get("resultCode");
				if(resultCode==0){
					TblBarUser user = (TblBarUser)map.get("user");
					session.setAttribute("manage_user", user);
					System.out.println("==========OK");
					return "redirect:/manage/index.do";
				}else{
					errMsg = map.get("errMsg").toString();
				}
				
			} catch (NoSuchAlgorithmException e) {
				log.error(e.getMessage());
				errMsg=e.getMessage();
				e.printStackTrace();
			}
		}else{
			errMsg="验证码错误";
		}
		model.addAttribute("account", account);
		model.addAttribute("errMsg", errMsg);
		return "manage/login";
	}
	
}
