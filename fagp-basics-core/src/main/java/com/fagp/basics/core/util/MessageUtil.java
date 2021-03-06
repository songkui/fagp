package com.fagp.basics.core.util;

import com.fagp.basics.core.enm.HandlerType;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MessageUtil {
	
	public static Parser parseMessage(HandlerType msgType) throws Exception {
		Class<?> clazz = msgType.getMsgClass();
		Method m = clazz.getDeclaredMethod("getDefaultInstance", new Class[]{});
		GeneratedMessageV3 messageObj = (GeneratedMessageV3)m.invoke(clazz, new Object[]{});
		return messageObj.getParserForType();
	}

}
