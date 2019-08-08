package com.fagp.game.lobby.config;

import com.fagp.basics.net.componentscan.ComponentScan;
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
    private final LobbyServerProperties fruitsServerProperties;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public StartInitialize(TcpServer tcpServer, LobbyServerProperties fruitsServerProperties){
        this.tcpServer = tcpServer;
        this.fruitsServerProperties = fruitsServerProperties;
    }

    public void start() throws Exception {
        stringRedisTemplate.opsForValue().set("lobby::prot","9090");
        new ComponentScan().scan("com/fagp/game/lobby/service");
        tcpServer.start(fruitsServerProperties.getNettyProperties());
    }
}
