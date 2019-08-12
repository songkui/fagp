package com.fagp.basics.net.client;

import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.protobuf.aheader.Header;
import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;
import com.fagp.basics.core.util.MessageUtil;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.ConcurrentHashMap;


public class ProtocolClientHandler extends ChannelInboundHandlerAdapter {
	private ConcurrentHashMap<Integer, Parser> parserMap = new ConcurrentHashMap<>();

	private final static short MESSAGE_FLAG = 0x1425;


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
			int cmd = 11001;
			LobbyProtoRequest.LoginRequest request = LobbyProtoRequest.LoginRequest.newBuilder()
					.setMac("Mac address")
					.setPassword("aa123456")
					.setPhone("18615780661")
					.build();
			message = genRequestMessage(request, cmd);
			ctx.writeAndFlush(message);
			System.out.println("send: "+request);
		}
		//ctx.flush();
	}
	
	
	
	private ByteBuf genRequestMessage(GeneratedMessageV3 msgObj, int cmd){


		
		ByteBuf message = Unpooled.buffer(msgObj.toByteArray().length+6);
		message.writeShort(MESSAGE_FLAG);
		message.writeInt(cmd).writeInt(msgObj.toByteArray().length)
		       .writeBytes(msgObj.toByteArray());
		
		return message;
		
	}
	
	private GeneratedMessageV3 parserMessage(ByteBuf byteBuf) throws Exception{

		System.out.println(byteBuf.readShort() );
		int msgCode = byteBuf.readInt();
		System.out.println(msgCode );
		System.out.println(byteBuf.readInt() );
		System.out.println(byteBuf.readInt() );


		HandlerType type = HandlerType.valueOfCode(msgCode);

		Parser parser = parserMap.get(type.code());
		if(parser == null){
			parser = MessageUtil.parseMessage(type);
			parserMap.put(type.code(), parser);
		}

		byte[] bytes = new byte[byteBuf.readableBytes()];
		byteBuf.readBytes(bytes);
		GeneratedMessageV3 responseMessage = (GeneratedMessageV3) parser.parseFrom(bytes);
		
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
