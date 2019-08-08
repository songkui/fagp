package com.fagp.basics.core.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.util.Properties;

/**
 * spring context utils.Use this utils can get bean anywhere
 * @author ruijf
 *
 */
public class ApplicationContextUtil {
	private static ApplicationContext ac;

	public static  void setAc(ApplicationContext ac) {
		ApplicationContextUtil.ac = ac;
	}
	
	public static ApplicationContext getAc() {
		return ac;
	}
	
	public static Object getBean(String name){
		if (ac!=null ) {
			return ac.getBean(name);
		}
		return null;
	}
	
	public static <T> T getBean(Class<T> clazz){
		if (ac!=null ) {
			return ac.getBean(clazz);
		}
		return null;
	}
	
	public static <T> T getBean(String name,Class<T> clazz){
		if (ac!=null ) {
			return ac.getBean(name,clazz);
		}
		return null;
	}
	
	
	public static String getPropertiesValue(String key){
		Properties properties = (Properties)ac.getBean("config");
		String value = properties.getProperty(key);
		if (StringUtils.isEmpty(value)){
			return null;
		}
		return value.trim();
	}
	
	public synchronized static void init(String path){
		if (ac == null){
			ac = new ClassPathXmlApplicationContext(path);
		}
	}
	
}
