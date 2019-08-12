package com.fagp.basics.net.servers;

import com.fagp.basics.core.config.NettyProperties;
import com.fagp.basics.core.constant.ConstantValue;
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
 * @Description: 服务器
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
                .option(ChannelOption.SO_BACKLOG, ConstantValue.SO_BACKLOG)
                .childOption(ChannelOption.SO_REUSEADDR, true)
                .childOption(ChannelOption.SO_RCVBUF, ConstantValue.SO_RCVBUF)
                .childOption(ChannelOption.SO_SNDBUF, ConstantValue.SO_SNDBUF)
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
