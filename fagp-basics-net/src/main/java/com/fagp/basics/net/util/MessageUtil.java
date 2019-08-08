package com.fagp.basics.net.util;

import com.fagp.basics.core.enm.HandlerType;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;

import java.lang.reflect.Method;

public class MessageUtil {
	

	public static Parser<?> parseMessageParse(HandlerType msgType) throws Exception{
//		String clazzName = "com.fagp.basics.net.proto.RHMS$"+msgType.name().replaceFirst("M_", "");
		Class<?> clazz = msgType.getMsgClass();
		Method m = clazz.getDeclaredMethod("getDefaultInstance", new Class[]{});
		GeneratedMessageV3 messageObj = (GeneratedMessageV3)m.invoke(clazz, new Object[]{});
		Parser<?> parser = messageObj.getParserForType();
		return parser;
	}

}
