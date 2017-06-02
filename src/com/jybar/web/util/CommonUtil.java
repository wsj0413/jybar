package com.jybar.web.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class CommonUtil {
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNotNullorBlank(String str) {
		boolean tag = false;
		if (str != null && str.trim() != "" && !str.trim().equals("")) {
			tag = true;
			return tag;
		} else {
			tag = false;
		}
		return tag;
	}

	/**
	 * isWindowsOS:判断是否为Window操作系统. <br/>
	 * 
	 * @return
	 */
	public static boolean isWindowsOS() {
		boolean isWindowsOS = false;
		String osName = System.getProperty("os.name");
		if (osName.toLowerCase().indexOf("windows") > -1) {
			isWindowsOS = true;
		}
		return isWindowsOS;
	}
	
	/**
	 * 生成一个激活码。
	 * 
	 * @return
	 */
	public static String generateRandomkey(){
		String time  = String.valueOf(System.nanoTime());
		Random r = new Random();
		String key = String.valueOf(r.nextInt(100000000));
		while(key.length() < 8){
			key = "0" + key;
		}
		
		BigInteger bi = new BigInteger (time + key);
		return bi.toString(32);	
	}
	
	
	/**
	 * 生成一个6位数的验证码。
	 * 
	 * @return
	 */
	public static String generateCheckCode(){
		String time = String.valueOf(System.nanoTime());
		while(time.length() > 6){
			time = time.substring(1, time.length());
		}
		
		return time;
	}
	
	
	
	/**
	 * 从cookie中获取对应的cookie的值
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getCookieValue(HttpServletRequest request, String name){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0){
			for(Cookie cookie: cookies){
				String cookieName = cookie.getName();
				if(StringUtils.equals(cookieName, name)){
					return cookie.getValue();
				}
			}
		}
		return null;
	}
	
	public static void SetCookieValue(HttpServletResponse response,String cookieName,String cookieValue,int cookieTime){
		  Cookie cookie = new Cookie(cookieName,cookieValue);
		  cookie.setPath("/");
		  //设置生命周期为1小时，秒为单位
          cookie.setMaxAge(cookieTime);
          response.addCookie(cookie);
	}
	
	
	public static String DoSafeString(String str,int saveStart,int saveEnd,String safeCode){
		if(CommonUtil.isNotNullorBlank(str)){
			StringBuffer sb= new StringBuffer(str);
			int codeNum=sb.substring(saveStart, sb.length()-saveEnd).length();
			StringBuffer sbCode= new StringBuffer(safeCode);
			for (int i = 0; i < codeNum; i++) {
				sbCode.append(safeCode);
			}
			sb=sb.replace(saveStart, sb.length()-saveEnd, sbCode.toString());
			return sb.toString();
			
		}else{
			return str;
		}
	}
	
	public static boolean isNumeric(String str){ 
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    return pattern.matcher(str).matches();    
	 }
	
	
	public static String byteToBase64(byte[] by){
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(by);
	}
	
	public static byte[] base64ToByte(String base64) throws IOException{
		BASE64Decoder decode = new BASE64Decoder(); 
		return decode.decodeBuffer(base64);
	}
	
	public static byte[] InputStreamToByte(InputStream iStrm) throws IOException {
	    ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
	    int ch;
	    while ((ch = iStrm.read()) != -1)
	    {
	       bytestream.write(ch);
	    }
	    byte imgdata[]=bytestream.toByteArray();
	    bytestream.close();
	    return imgdata;
	  }
	
}
