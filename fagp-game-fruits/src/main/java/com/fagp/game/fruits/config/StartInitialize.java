package com.fagp.game.fruits.config;

import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.tcp.TcpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Auther: SK
 * @Date: 2019/8/4 10:36
 * @Description:
 */
@Component
public class StartInitialize {
    private final TcpServer tcpServer;
    private final FruitsServerProperties fruitsServerProperties;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public StartInitialize(TcpServer tcpServer, FruitsServerProperties fruitsServerProperties){
        this.tcpServer = tcpServer;
        this.fruitsServerProperties = fruitsServerProperties;
    }

    public void start() throws Exception {
        InitializeMappingMap.initializeMapping(); //初始化 数据
        stringRedisTemplate.opsForValue().set("fruits:porto","8080");
        tcpServer.start(fruitsServerProperties.getNettyProperties());
    }
}
