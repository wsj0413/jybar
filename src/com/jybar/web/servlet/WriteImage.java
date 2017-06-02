package com.jybar.web.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jybar.web.service.ImageManageService;
import com.jybar.web.util.CommonUtil;
@Component
public class WriteImage extends HttpServlet {
	@Resource
	private ImageManageService service;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	             throws ServletException, IOException {
	       this.doPost(req, resp);
	     }
	     @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	         try {
	        	 resp.setContentType("text/html; charset=UTF-8");
	        	 resp.setContentType("image/jpeg");
	        	 String tid=req.getParameter("imageTid");
	        	 byte[] imgByte=service.selectByPrimaryKey(Long.parseLong(tid)).getTbyte();
	        	 OutputStream os =  resp.getOutputStream();
	        	//图片输出的输出流
	        	InputStream in =new ByteArrayInputStream(imgByte);
	        	int count = 0;
	        	byte[] buffer = new byte[1024 * 8];
				while ((count = in.read(buffer)) != -1){
					os.write(buffer, 0, count);
				}
	        	os.flush();
	        	//输入完毕，清除缓冲
	        	os.close();
	         } catch (Exception e) {
	             System.out.println("error");
	       }
	     }
}
