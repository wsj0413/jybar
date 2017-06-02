package com.jybar.web.controller.manage;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.service.UrlResourceManageService;
import com.jybar.web.util.CommonFinal;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 平台推荐管理
 * @author 封程中  2014年8月3日 22:26:15
 *
 */
@Controller
@RequestMapping(value="/manage/platRec")
public class PlatformRecManageController {
	Logger log  =  Logger.getLogger(PlatformRecManageController.class );
	
	@Autowired
	private UrlResourceManageService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam("currPage") int currPage,@ModelAttribute("url") TblUrlResource url,@RequestParam("startDate") String startDate,@RequestParam("endDate") String endDate){
		ModelAndView mv=new ModelAndView("manage/urlResouceManage/platformRecList");
		Page page = new Page();
		page.setBegin(currPage);
		try {
			service.selectPlatList(page,url,startDate,endDate);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		page.setPageHtml(page); 
		mv.addObject("url", url);
		mv.addObject("startDate", startDate);
		mv.addObject("endDate", endDate);
		mv.addObject("pageInfo", page);
		mv.addObject("urlList", page.getResult());
		return mv;
	}
	
	@RequestMapping(value = "/add")
	public String add(){
		return "manage/urlResouceManage/platformRecEdit";
	}

	@RequestMapping(value = "/update")
	public String update(Model model,@RequestParam("tid")long tid){
		TblUrlResource url= service.selectByPrimaryKey(tid);
		 model.addAttribute("url", url);
		 model.addAttribute("tid", tid);
		return "manage/urlResouceManage/platformRecEdit";
	}
	
	@RequestMapping(value = "/editUrl")
	public String editUrl(Model model,@ModelAttribute("url") TblUrlResource url){
		 try {
			url.setUrltype(CommonFinal.URLRESOURCE_PLATFORMREC);
			Map<String,Object> map =service.editUrl(url);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/platRec/list.do?currPage=1&&startDate=&&endDate=";
			}else{	
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
			
		}
		model.addAttribute("url", url);
		return "manage/urlResouceManage/platformRecEdit";
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete")
	public Object delete(Model model,@RequestParam("tid")List<Long> tid){
		Map<String, Object> map = null;
		try {
			map=service.deleteUrl(tid);
			return map;
		} catch (Exception e) {
			log.error(e.getMessage());
			return map;
		}
	}
	
}
