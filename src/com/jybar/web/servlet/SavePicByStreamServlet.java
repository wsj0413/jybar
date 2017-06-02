package com.jybar.web.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jybar.web.entity.TblImage;
import com.jybar.web.service.ImageManageService;
import com.jybar.web.util.CommonUtil;
import com.jybar.web.util.GetPropert;
import com.jybar.web.util.ResultUtils;


/**
 * @author Administrator
 * 
 */
@Component
public class SavePicByStreamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Resource
	private ImageManageService service;
	

	@Override
	public void service(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		
		JSONObject result = new JSONObject();
		resp.setCharacterEncoding( "UTF-8");
		resp.setHeader("Content-Type", "text/html"); 
		PrintWriter out = resp.getWriter();	
		String addType=request.getParameter("addType") ==null? "" :request.getParameter("addType");
		String dir=request.getParameter("dir") ==null? "" :request.getParameter("dir");
		System.out.println(addType);
		FileItemFactory factory = new DiskFileItemFactory();
		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// Parse the request
		List<FileItem> items;
		OutputStream os =null;
		try {
			items = upload.parseRequest(request);
			Iterator<FileItem> iter = items.iterator();
			FileItem fileItem=null;
			while (iter.hasNext()) {
				InputStream inputStream = null;
				FileItem item = (FileItem) iter.next();
				long imageTid=0;
				if(!CommonUtil.isNotNullorBlank(item.getName())){
					continue;
				}
				if (item.isFormField()) {
				} else {
					fileItem = item;	
					inputStream = fileItem.getInputStream();
					System.out.println(fileItem.getName());
					TblImage img=new TblImage();
					img.setTbyte(CommonUtil.InputStreamToByte(inputStream));
					img.setTtype(2);
					imageTid=(Long)(service.editImg(img).get("tid"));
				}
				
				// close net io stream
				inputStream.close();
				result.put("resultCode", ResultUtils.RESULT_CODE_SUCCESS);
				result.put("tid", imageTid);
				if("image".equals(dir)){
					result.put("error", ResultUtils.RESULT_CODE_SUCCESS);
					result.put("url", GetPropert.getPropertyByName("config", "selfUrl")+"writeImage?imageTid="+imageTid);
				}	
				
			}
		} catch (Exception e) {
			//e.printStackTrace();
			result.put("resultCode", ResultUtils.RESULT_CODE_FAIL);
			if("image".equals(dir)){
				result.put("error", ResultUtils.RESULT_CODE_FAIL);
			}
		}finally{
			if(os!=null)
				os.close();
		}
		out.print(result);
		out.flush();
		out.close();
	}
	

}
