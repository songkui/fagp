package com.fagp.basics.net.test;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.fagp.basics.net.proto.RHMS;
import com.fagp.basics.net.util.MessageUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.ConcurrentHashMap;


public class ProtocolClientHandler extends ChannelInboundHandlerAdapter {
	private ConcurrentHashMap<RHMS.MsgType, Parser<?>> parserMap = new ConcurrentHashMap<RHMS.MsgType, Parser<?>>();


	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		GeneratedMessageV3 response = parserMessage((ByteBuf)msg);
		System.out.println(">>>>"+response);
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		ByteBuf message;
		for(int i=0;i<1;i++){
			RHMS.LoginRequest request = RHMS.LoginRequest.newBuilder()
					.setAccount("user001")
					.setPasswd("123456")
					.build();
			//message = Unpooled.copiedBuffer(request.toByteArray());
			message = genRequestMessage(request);
			ctx.writeAndFlush(message);
			System.out.println("send: "+request);
		}
		//ctx.flush();
	}
	
	
	
	private ByteBuf genRequestMessage(GeneratedMessageV3 msgObj){
		String clazzName = msgObj.getClass().getName();
		clazzName = clazzName.substring(clazzName.indexOf("$")+1,clazzName.length());
		String enumName = "M_"+clazzName;
		int msgType = RHMS.MsgType.valueOf(enumName).getNumber();
		
		byte[] msgObjBytes = msgObj.toByteArray();
		
		ByteBuf message = Unpooled.buffer(msgObjBytes.length+4);
		message.writeInt(msgType)
		       .writeBytes(msgObjBytes);
		
		return message;
		
	}
	
	private GeneratedMessageV3 parserMessage(ByteBuf buf) throws Exception{
		int msgCode = buf.readInt();
		RHMS.MsgType msgType = RHMS.MsgType.valueOf(msgCode);
		Parser<?> parser = parserMap.get(msgType);
		if(parser == null){
			parser = MessageUtil.parseMessageParse(msgType);
			parserMap.put(msgType, parser);
		}
		byte[] protobufBytes = new byte[buf.readableBytes()];
		buf.readBytes(protobufBytes);
		GeneratedMessageV3 responseMessage = (GeneratedMessageV3) parser.parseFrom(protobufBytes);
		
		return responseMessage;
	}
	

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		cause.printStackTrace();
		ctx.close();
		//super.exceptionCaught(ctx, cause);
	}
	
	
	
}
