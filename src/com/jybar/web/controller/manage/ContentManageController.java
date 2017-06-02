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
import com.jybar.web.service.ArticleManageService;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 内容管理
 * @author 封程中 2014年8月26日 23:32:11
 *
 */
@Controller
@RequestMapping(value="/manage/content")
public class ContentManageController {
	Logger log  =  Logger.getLogger(ContentManageController.class );
	
	@Autowired
	private ArticleManageService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam("currPage") int currPage,@ModelAttribute("art") TblArticle art){
		ModelAndView mv=new ModelAndView("manage/contentManage/contentList");
		Page page = new Page();
		page.setBegin(currPage);
		try {
			service.selectArtList(page,art);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		page.setPageHtml(page); 
		mv.addObject("art", art);
		mv.addObject("pageInfo", page);
		mv.addObject("artList", page.getResult());
		return mv;
	}
	
	@RequestMapping(value = "/add")
	public String add(){
		return "manage/contentManage/contentEdit";
	}

	@RequestMapping(value = "/update")
	public String update(Model model,@RequestParam("tid")long tid){
		TblArticle art= service.selectByPrimaryKey(tid);
		 model.addAttribute("art", art);
		return "manage/contentManage/contentEdit";
	}
	
	@RequestMapping(value = "/editArt")
	public String editUrl(Model model,@ModelAttribute("art") TblArticle art,HttpSession session){
		 try {
			TblBarUser us=(TblBarUser)session.getAttribute("manage_user");
			art.setAauthor(us.getUserAccount());
			art.setAauthorname(us.getUserNickname());
			Map<String,Object> map =service.editArt(art);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/content/list.do?currPage=1";
			}else{
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
			
		}
		model.addAttribute("art", art);
		return "manage/contentManage/contentEdit";
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete")
	public Object delete(Model model,@RequestParam("tid")List<Long> tid){
		Map<String, Object> map = null;
		try {
			map=service.deleteArt(tid);
			return map;
		} catch (Exception e) {
			log.error(e.getMessage());
			return map;
		}
	}
	
	
	
}
