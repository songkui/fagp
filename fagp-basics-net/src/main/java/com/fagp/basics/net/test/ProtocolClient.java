package com.fagp.basics.net.test;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;


public class ProtocolClient {
	
	public void connect(String host,int port) throws Exception{
		EventLoopGroup group  = new NioEventLoopGroup();
		try{
			Bootstrap b = new Bootstrap();
			b.group(group)
			 .channel(NioSocketChannel.class)
			 .option(ChannelOption.TCP_NODELAY, true)
			 .handler(new ChannelInitializer<SocketChannel>() {

				@Override
				protected void initChannel(SocketChannel ch) throws Exception {
					ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE,0,4,0,4))
								 .addLast(new LengthFieldPrepender(4))
								 .addLast(new ProtocolClientHandler());
				}
				 
			 });
			
			ChannelFuture future = b.connect(host, port).sync();
			future.channel().closeFuture().sync();
			
		}finally{
			group.shutdownGracefully();
		}
	}
	

}
