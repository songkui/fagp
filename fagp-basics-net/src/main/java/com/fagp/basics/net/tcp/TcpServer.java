package com.fagp.basics.net.tcp;

import com.fagp.basics.core.config.NettyProperties;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shiyajian
 * create: 2018-11-26
 */
@Component
public class TcpServer {

    private Logger logger = LoggerFactory.getLogger(TcpServer.class);
    private final SocketChannelInitializer socketChannelInitializer;


    @Autowired
    public TcpServer( SocketChannelInitializer socketChannelInitializer) {
        this.socketChannelInitializer = socketChannelInitializer;
    }

    public void start(NettyProperties nettyProperties)throws InterruptedException {

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(new NioEventLoopGroup(nettyProperties.getBossCount()),
                new NioEventLoopGroup(nettyProperties.getWorkerCount()))
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childOption(ChannelOption.SO_REUSEADDR, true) //重用地址
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(socketChannelInitializer);

        ChannelFuture channelFuture = serverBootstrap.bind(nettyProperties.getPort()).sync();
        logger.info("netty server is running, port: {}", nettyProperties.getPort());
        // 监听服务器关闭监听
        channelFuture.channel().closeFuture().sync();

    }

}
