package com.jybar.web.controller.manage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jybar.web.entity.TblBarUser;
import com.jybar.web.service.UserManageService;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;
/**
 * 用户管理
 * @author 封程中
 *
 */

@Controller
@RequestMapping(value="/manage/user")
public class UserManageController {
	Logger log  =  Logger.getLogger(UserManageController. class );
	
	@Autowired
	private UserManageService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam("currPage") int currPage){
		ModelAndView mv=new ModelAndView("manage/userManage/list");
		Page page = new Page();
		page.setBegin(currPage);
		page=service.selectUserList(page);
		page.setPageHtml(page); 
		mv.addObject("pageInfo", page);
		mv.addObject("userList", page.getResult());
		return mv;
	}
	
	@RequestMapping(value = "/add")
	public String add(){
		return "manage/userManage/edit";
	}
	
	@RequestMapping(value = "/update")
	public String update(Model model,@RequestParam("userId")long userId){
		TblBarUser user= service.selectByPrimaryKey(userId);
		 model.addAttribute("updateUser", user);
		 model.addAttribute("userId", userId);
		return "manage/userManage/edit";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/delete")
	public String delete(Model model,@RequestParam("userId")List<Long> userId){
		
		try {
			Map<String, Object> map = service.deleteUser(userId);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/user/list.do?currPage=1";
			}else{
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
		}
		return "manage/userManage/edit";
	}
	
	@RequestMapping(value = "/updateUser")
	public String updateUser(Model model,@RequestParam("reuserPassword") String reuserPassword,@ModelAttribute("user") TblBarUser user,@RequestParam("userId") long userId){
		 try {
			Map<String,Object> map =service.addUser(user, reuserPassword,userId);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/user/list.do?currPage=1";
			}else{
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
			
		}
		 model.addAttribute("updateUser", user);
		return "manage/userManage/edit";
	}
	
	
	
}
