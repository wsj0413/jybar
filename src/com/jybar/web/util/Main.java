package com.jybar.web.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Main {
	 static BASE64Encoder encoder = new sun.misc.BASE64Encoder();      
	    static BASE64Decoder decoder = new sun.misc.BASE64Decoder();      
	          
	    public static void main(String[] args) {      
	        System.out.println(getImageBinary());      
	              
	        base64StringToImage(getImageBinary());      
	    }      
	          
	    public static String getImageBinary(){      
	        File f = new File("C:\\Users\\thinkpad\\Desktop\\IMG_20140712_223937.jpg");             
	        BufferedImage bi;      
	        try {      
	            bi = ImageIO.read(f);      
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();      
	            ImageIO.write(bi, "jpg", baos);      
	            byte[] bytes = baos.toByteArray();      
	                  System.out.println("======"+bytes);
	            return encoder.encodeBuffer(bytes).trim();      
	        } catch (IOException e) {      
	            e.printStackTrace();      
	        }      
	        return null;      
	    }      
	          
	    static void base64StringToImage(String base64String){      
	        try {      
	            byte[] bytes1 = decoder.decodeBuffer(base64String);      
	                  
	            ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);      
	            BufferedImage bi1 =ImageIO.read(bais);      
	            File w2 = new File("c://QQ.bmp");//可以是jpg,png,gif格式      
	            ImageIO.write(bi1, "jpg", w2);//不管输出什么格式图片，此处不需改动      
	        } catch (IOException e) {      
	            e.printStackTrace();      
	        }      
	    }   
}

