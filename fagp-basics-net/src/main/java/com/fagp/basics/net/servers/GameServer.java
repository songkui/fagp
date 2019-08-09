package com.fagp.basics.net.servers;

import com.fagp.basics.core.config.NettyProperties;
import com.fagp.basics.net.handler.GameChannelInitializer;
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
 * 启动Server
 * @author Song.King
 */
@Component
public class GameServer extends ServerFactory {

    private Logger logger = LoggerFactory.getLogger(GameServer.class);
    private final GameChannelInitializer gameChannelInitializer;


    @Autowired
    public GameServer(GameChannelInitializer gameChannelInitializer) {
        this.gameChannelInitializer = gameChannelInitializer;
    }

    public void start(NettyProperties nettyProperties)throws InterruptedException {

        initialize(nettyProperties, gameChannelInitializer);

    }

}
