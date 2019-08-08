package com.fagp.basics.net.tcp;


import com.fagp.basics.net.proto.RHMS;
import com.fagp.basics.net.util.MapUtil;
import com.fagp.basics.net.util.MessageUtil;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class RequestDispatcherHandler extends ChannelInboundHandlerAdapter {
	private ConcurrentHashMap<RHMS.MsgType, Parser<?>> parserMap = new ConcurrentHashMap<RHMS.MsgType, Parser<?>>();
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		
		ByteBuf buf = (ByteBuf)msg;
		
		//get request message
		int msgCode = buf.readInt();
		RHMS.MsgType msgType = RHMS.MsgType.valueOf(msgCode);
		Parser<?> parser = parserMap.get(msgType);
		if(parser == null){
			parser = MessageUtil.parseMessageParse(msgType);
			parserMap.put(msgType, parser);
		}
		byte[] protobufBytes = new byte[buf.readableBytes()];
		buf.readBytes(protobufBytes);
		GeneratedMessageV3 requestMessage = (GeneratedMessageV3) parser.parseFrom(protobufBytes);
		
		Method handleMethod = MapUtil.methodMap.get(msgType);
		Object handleObject = MapUtil.handlerMap.get(msgType);
		GeneratedMessageV3 response  = (GeneratedMessageV3)handleMethod.invoke(handleObject,requestMessage);
		//do service
		/*RequestService service = (RequestService)MapUtil.serviceMap.get(msgType.name());
		GeneratedMessage response = service.doService(requestMessage);*/
		System.out.println(response);
		
		//add msgType
		int responseType = MessageUtil.parseMessageType(response);
		byte[] bytes = response.toByteArray();
		ByteBuf responseMessage = Unpooled.buffer(bytes.length+4);
		responseMessage.writeInt(responseType)
					   .writeBytes(bytes);
		
		ctx.writeAndFlush(responseMessage);
	}

}
