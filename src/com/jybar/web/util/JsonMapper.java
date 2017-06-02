package com.jybar.web.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 简单封装Jackson，实现JSON String<->Java Object的Mapper.
 * 
 * 封装不同的输出风格, 使用不同的builder函数创建实例.
 * 
 * @author wangliming
 */
public class JsonMapper {

	private static Log logger = LogFactory.getLog(JsonMapper.class);

	private final ObjectMapper mapper;

	public JsonMapper() {
		this(null);
	}

	public JsonMapper(Include include) {
		mapper = new ObjectMapper();
		// 设置输出时包含属性的风格
		if (include != null) {
			mapper.setSerializationInclusion(include);
		}
		// 建只输出非Null且非Empty(如List.isEmpty)的属性到Json字符串的Mapper,建议在外部接口中使用
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		// 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	}

	/**
	 * 创建只输出非Null且非Empty(如List.isEmpty)的属性到Json字符串的Mapper,建议在外部接口中使用.
	 */
	public static JsonMapper nonEmptyMapper() {
		return new JsonMapper(Include.NON_EMPTY);
	}

	/**
	 * 创建只输出初始值被改变的属性到Json字符串的Mapper, 最节约的存储方式，建议在内部接口中使用。
	 */
	public static JsonMapper nonDefaultMapper() {
		return new JsonMapper(Include.NON_DEFAULT);
	}

	/**
	 * Object可以是POJO，也可以是Collection或数组。 如果对象为Null, 返回"null". 如果集合为空集合, 返回"[]".
	 */
	public String toJson(Object object) {

		try {
			return mapper.writeValueAsString(object);
		} catch (IOException e) {
			logger.warn("write to json string error:" + object, e);
			return null;
		}
	}

	/**
	 * 反序列化POJO或简单Collection如List<String>.
	 * 
	 * 如果JSON字符串为Null或"null"字符串, 返回Null. 如果JSON字符串为"[]", 返回空集合.
	 * 
	 * 如需反序列化复杂Collection如List<MyBean>, 请使用fromJson(String, JavaType)
	 * 
	 * @see #fromJson(String, JavaType)
	 */
	public <T> T fromJson(String jsonString, Class<T> clazz) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}

		try {
			return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
			return null;
		}
	}

	/**
	 * 反序列化复杂Collection如List<Bean>,
	 * 先使用createCollectionType()或contructMapType()构造类型, 然后调用本函数.
	 * 
	 * @see #createCollectionType(Class, Class...)
	 */
	public <T> T fromJson(String jsonString, JavaType javaType) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}

		try {
			return (T) mapper.readValue(jsonString, javaType);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
			return null;
		}
	}

	/**
	 * 当JSON里只含有Bean的部分屬性時，更新一個已存在Bean，只覆蓋該部分的屬性.
	 */
	public void update(String jsonString, Object object) {
		try {
			mapper.readerForUpdating(object).readValue(jsonString);
		} catch (JsonProcessingException e) {
			logger.warn("update json string:" + jsonString + " to object:"
					+ object + " error.", e);
		} catch (IOException e) {
			logger.warn("update json string:" + jsonString + " to object:"
					+ object + " error.", e);
		}
	}

	/**
	 * 取出Mapper做进一步的设置或使用其他序列化API.
	 */
	public ObjectMapper getMapper() {
		return mapper;
	}
	
	public static String modelBeanToJSON(final List<String> filterField, List<?> list){
        JSONArray jsonObjects = new JSONArray();  
          
        int i=0;  
        Iterator<?> it = list.iterator();  
          
        while(it.hasNext()){  
         JSONObject jsonObject = new JSONObject();  
         Object obj = it.next();//这里的Obj对象只是list中的存放的对象类型  
        
         JsonConfig jsonConfig = new JsonConfig();
        
         PropertyFilter filter = new PropertyFilter() {
             public boolean apply(Object source, String name, Object value) {
                 boolean isFiltered=false;
                 for(String string:filterField){
                     if(string.equals(name)){
                         isFiltered=true;
                     }
                 }
                 if (isFiltered) {
                     return true;
                 }
                 return false;
             }
         };
         jsonConfig.setJsonPropertyFilter(filter);  
         
         jsonObject=JSONObject.fromObject(obj, jsonConfig);
         jsonObjects.add(i++, jsonObject);  
        }  
        return jsonObjects.toString();
    }
	public static String modelBeanToJSON(final List<String> filterField, Object obj){
        JsonConfig jsonConfig = new JsonConfig();
        PropertyFilter filter = new PropertyFilter() {
            public boolean apply(Object source, String name, Object value) {
                boolean isFiltered=false;
                for(String string:filterField){
                    if(string.equals(name)){
                        isFiltered=true;
                    }
                }
                if (isFiltered) {
                    return true;
                }
                return false;
            }
        };
         jsonConfig.setJsonPropertyFilter(filter);  
         JSONObject jsonObject=JSONObject.fromObject(obj, jsonConfig);
       
        return jsonObject.toString();
    }
}
