package com.jybar.web.controller.manage;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jybar.web.service.UserManageService;


@Controller
@RequestMapping(value="/manage/index")
public class IndexController {
	Logger log  =  Logger.getLogger(IndexController. class );
	
	@Autowired
	private UserManageService service;
	
	@RequestMapping(value = "")
	public ModelAndView index(Model model,HttpSession session){
		if(null == session.getAttribute("manage_user")){
			return new ModelAndView("manage/login");
		}else{
			//TODO 直接登录
			return new ModelAndView("manage/index");
		}
	}
	
}
