package com.fagp.basics.net.tcp;


import com.fagp.basics.core.config.HandlerMappingInfo;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.util.MessageUtil;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.ConcurrentHashMap;

public class RequestDispatcherHandler extends ChannelInboundHandlerAdapter {
	private ConcurrentHashMap<HandlerType, Parser<?>> parserMap = new ConcurrentHashMap<>();
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		
		ByteBuf buf = (ByteBuf)msg;
		
		//get request message
		int msgCode = buf.readInt();
		HandlerType msgType = HandlerType.valueOfCode(msgCode);
		Parser<?> parser = parserMap.get(msgType);
		if(parser == null){
			parser = MessageUtil.parseMessageParse(msgType);
			parserMap.put(msgType, parser);
		}
		byte[] protobufBytes = new byte[buf.readableBytes()];
		buf.readBytes(protobufBytes);
		GeneratedMessageV3 requestMessage = (GeneratedMessageV3) parser.parseFrom(protobufBytes);
		
//		Method handleMethod = MapUtil.methodMap.get(msgType);
//		Object handleObject = MapUtil.handlerMap.get(msgType);
		HandlerMappingInfo handlerMappingInfo = InitializeMappingMap.getMapping(msgType.code());


		GeneratedMessageV3 response  = (GeneratedMessageV3)handlerMappingInfo.getMethod().invoke(handlerMappingInfo.getHandler(),requestMessage);
		System.out.println(response);
		//简单明了 多行变成了1行
		ctx.writeAndFlush(ApiProtoBufResponse.newBuild().cmd(msgCode).data(response).buildByteBuf());
	}

}
