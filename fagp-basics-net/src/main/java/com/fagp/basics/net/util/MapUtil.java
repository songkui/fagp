package com.fagp.basics.net.util;


import com.fagp.basics.net.proto.RHMS;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class MapUtil {
	public static ConcurrentHashMap<RHMS.MsgType, Method> methodMap =  new ConcurrentHashMap<RHMS.MsgType, Method>();
	public static ConcurrentHashMap<RHMS.MsgType, Object> handlerMap =  new ConcurrentHashMap<RHMS.MsgType, Object>();
}
