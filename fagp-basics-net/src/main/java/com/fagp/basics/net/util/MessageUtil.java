package com.fagp.basics.net.util;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.fagp.basics.net.proto.RHMS;

import java.lang.reflect.Method;

public class MessageUtil {
	
	public static int parseMessageType(GeneratedMessageV3 msgObj){
		String clazzName = msgObj.getClass().getName();
		clazzName = clazzName.substring(clazzName.indexOf("$")+1,clazzName.length());
		String enumName = "M_"+clazzName;
		int msgType = RHMS.MsgType.valueOf(enumName).getNumber();
		
		return msgType;
	}
	
	public static Parser<?> parseMessageParse(RHMS.MsgType msgType) throws Exception{
		String clazzName = "com.fagp.basics.net.proto.RHMS$"+msgType.name().replaceFirst("M_", "");
		Class<?> clazz = Class.forName(clazzName);
		Method m = clazz.getDeclaredMethod("getDefaultInstance", new Class[]{});
		GeneratedMessageV3 messageObj = (GeneratedMessageV3)m.invoke(clazz, new Object[]{});
		Parser<?> parser = messageObj.getParserForType();
		return parser;
	}

}
