package com.fagp.basics.net.servers;

import com.fagp.basics.core.config.NettyProperties;
import com.fagp.basics.net.handler.GameChannelInitializer;
import com.fagp.basics.net.handler.SdpChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
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
 * 数据中心服务 启动Server 赶时间 未进行封装
 * @author Song.King
 */
@Component
public class SdpServer extends ServerFactory{

    private Logger logger = LoggerFactory.getLogger(SdpServer.class);
    private final SdpChannelInitializer sdpChannelInitializer;


    @Autowired
    public SdpServer(SdpChannelInitializer sdpChannelInitializer) {
        this.sdpChannelInitializer = sdpChannelInitializer;
    }

    public void start(NettyProperties nettyProperties)throws InterruptedException {
         initialize(nettyProperties, sdpChannelInitializer);
    }

}
