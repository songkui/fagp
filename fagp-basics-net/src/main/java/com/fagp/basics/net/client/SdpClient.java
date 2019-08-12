package com.fagp.basics.net.client;

import com.fagp.basics.net.handler.SdpChannelInitializer;
import com.fagp.basics.net.handler.client.SdpClientChannelInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.stereotype.Component;

/**
 * 链接 数据层客户端 暂时没有用
 *
 */

@Component
public class SdpClient {


    public Channel connect(String addr, int port) throws Exception {
        final EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new LoggingHandler(LogLevel.DEBUG))
                    .handler(new SdpClientChannelInitializer());
            ChannelFuture f = b.connect(addr, port).sync();
            System.out.println("连接服务器:" + f.channel().remoteAddress() + ",本地地址:" + f.channel().localAddress());

            Channel cl = f.channel();
            cl.closeFuture().sync();//等待客户端关闭连接
            return cl;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            group.shutdownGracefully();
        }
    }

}

