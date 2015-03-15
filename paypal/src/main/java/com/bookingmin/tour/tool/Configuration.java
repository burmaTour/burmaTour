package com.bookingmin.tour.tool;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("static-access")
public class Configuration {
	private static Properties properties;
	
	static{
		try {
			properties = new Properties();
			properties.load(Configuration.class.getClassLoader().getSystemResourceAsStream("common.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取字符串形式的属性
	 * @param name
	 * @return
	 */
	public static String getStr(String name){
		String strValue = properties.getProperty(name);
		return strValue;
	}
	
	/**
	 * 获取整形类型的属性
	 * @param name
	 * @return
	 * @throws Exception 
	 */
	public static int getInt(String name) throws Exception{
		String strValue = properties.getProperty(name);
		if(StringUtils.isNotBlank(strValue)){
			return Integer.valueOf(strValue);
		}else{
			throw new Exception("the property query is not exist: name");
		}
	}
	
	/**
	 * 获取长整形属性
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static long getLong(String name) throws Exception{
		String strValue = properties.getProperty(name);
		if(StringUtils.isNotBlank(strValue)){
			return Long.valueOf(strValue);
		}else{
			throw new Exception("the property query is not exist: name");
		}
	}
	
}
