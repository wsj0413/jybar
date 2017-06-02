package com.jybar.web.controller.manage;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jybar.web.entity.TblArticle;
import com.jybar.web.entity.TblBarUser;
import com.jybar.web.entity.TblFriendLink;
import com.jybar.web.service.ArticleManageService;
import com.jybar.web.service.FriendLinkManageService;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 友情链接管理
 * @author 封程中 2014年9月8日 12:10:27
 *
 */
@Controller
@RequestMapping(value="/manage/friendLink")
public class FriendLinkManageController {
	Logger log  =  Logger.getLogger(FriendLinkManageController.class );
	
	@Autowired
	private FriendLinkManageService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam("currPage") int currPage,@ModelAttribute("fri") TblFriendLink fri){
		ModelAndView mv=new ModelAndView("manage/urlResouceManage/friendLinkList");
		Page page = new Page();
		page.setBegin(currPage);
		try {
			service.selectFriList(page,fri);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		page.setPageHtml(page); 
		mv.addObject("fri", fri);
		mv.addObject("pageInfo", page);
		mv.addObject("friList", page.getResult());
		return mv;
	}
	
	@RequestMapping(value = "/add")
	public String add(){
		return "manage/urlResouceManage/friendLinkEdit";
	}

	@RequestMapping(value = "/update")
	public String update(Model model,@RequestParam("tid")long tid){
		TblFriendLink fri= service.selectByPrimaryKey(tid);
		 model.addAttribute("fri", fri);
		return "manage/urlResouceManage/friendLinkEdit";
	}
	
	@RequestMapping(value = "/editArt")
	public String editUrl(Model model,@ModelAttribute("fri") TblFriendLink fri){
		 try {
			Map<String,Object> map =service.editFri(fri);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/friendLink/list.do?currPage=1";
			}else{
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
			
		}
		model.addAttribute("fri", fri);
		return "manage/contentManage/contentEdit";
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete")
	public Object delete(Model model,@RequestParam("tid")List<Long> tid){
		Map<String, Object> map = null;
		try {
			map=service.deleteFri(tid);
			return map;
		} catch (Exception e) {
			log.error(e.getMessage());
			return map;
		}
	}
	
	
	
}
