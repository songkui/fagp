package com.fagp.basics.net.servers;

import com.fagp.basics.core.config.NettyProperties;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: TODO
 * @Author King.Song
 * @Date 2019/8/9 0009
 **/
public abstract class ServerFactory {

    private Logger logger = LoggerFactory.getLogger(ServerFactory.class);

    public abstract void start(NettyProperties nettyProperties)throws InterruptedException;

    public void initialize(NettyProperties nettyProperties, ChannelInitializer channelInitializer)throws InterruptedException {

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(new NioEventLoopGroup(),  new NioEventLoopGroup())
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childOption(ChannelOption.SO_REUSEADDR, true) //重用地址
                .childOption(ChannelOption.SO_RCVBUF, 65536)
                .childOption(ChannelOption.SO_SNDBUF, 65536)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.ALLOCATOR, new PooledByteBufAllocator(false))  // heap buf 's better
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(channelInitializer);

        ChannelFuture channelFuture = serverBootstrap.bind(nettyProperties.getPort()).sync();
        logger.info("netty server is running, port: {}", nettyProperties.getPort());
        // 监听服务器关闭监听
        channelFuture.channel().closeFuture().sync();
    }

}
