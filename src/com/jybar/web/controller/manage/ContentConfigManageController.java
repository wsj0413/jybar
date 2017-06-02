package com.jybar.web.controller.manage;

import java.util.ArrayList;
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

import com.jybar.web.entity.TblConfig;
import com.jybar.web.entity.TblUrlResource;
import com.jybar.web.service.ConfigManageService;
import com.jybar.web.service.UrlResourceManageService;
import com.jybar.web.util.Page;
import com.jybar.web.util.ResultUtils;

/**
 * 内容配置管理
 * @author 封程中  2014年8月3日 22:26:15
 *
 */
@Controller
@RequestMapping(value="/manage/contentConfig")
public class ContentConfigManageController {
	Logger log  =  Logger.getLogger(ContentConfigManageController.class );
	
	@Autowired
	private ConfigManageService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam("currPage") int currPage,@ModelAttribute("config") TblConfig config){
		ModelAndView mv=new ModelAndView("manage/configManage/contentConfigList");
		Page page = new Page();
		page.setBegin(currPage);
		try {
			service.selectContentConfigList(page,config);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		page.setPageHtml(page); 
		mv.addObject("config", config);
		mv.addObject("pageInfo", page);
		mv.addObject("configList", page.getResult());
		return mv;
	}
	
	@RequestMapping(value = "/add")
	public String add(){
		return "manage/configManage/contentConfigEdit";
	}

	@RequestMapping(value = "/update")
	public String update(Model model,@RequestParam("tid")long tid){
		TblConfig config= service.selectByPrimaryKey(tid);
		 model.addAttribute("config", config);
		return "manage/configManage/contentConfigEdit";
	}
	
	@RequestMapping(value = "/editConfig")
	public String editUrl(Model model,@ModelAttribute("config") TblConfig config){
		 try {
			Map<String,Object> map =service.editConfig(config);
			if(ResultUtils.RESULT_CODE_SUCCESS ==(Integer)map.get("resultCode")){
				return "redirect:/manage/contentConfig/list.do?currPage=1";
			}else{
				model.addAttribute("errMsg", map.get("errMsg"));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			model.addAttribute("errMsg", e.getMessage());
			
		}
		model.addAttribute("config", config);
		return "manage/configManage/contentConfigEdit";
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete")
	public Object delete(Model model,@RequestParam("tid")List<Long> tid){
		Map<String, Object> map = null;
		try {
			map=service.deleteConfig(tid);
			return map;
		} catch (Exception e) {
			log.error(e.getMessage());
			return map;
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/findConfig")
	public Object findConfig(@RequestParam("paraName")String paraName){
		Map<String, Object> map = null;
		try {
			map=service.findConfig(paraName);
			return map;
		} catch (Exception e) {
			log.error(e.getMessage());
			return map;
		}
	}
	
}
