package com.fagp.game.fruits.config;

import com.fagp.basics.net.client.SdpClient;
import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.servers.GameServer;
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
    private final GameServer gameServer;
    private final SdpClient sdpClient;
    private final FruitsServerProperties fruitsServerProperties;
    private final SdpServerProperties sdpServerProperties;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public StartInitialize(GameServer gameServer, SdpClient sdpClient,
                           FruitsServerProperties fruitsServerProperties,
                           SdpServerProperties sdpServerProperties){
        this.gameServer = gameServer;
        this.fruitsServerProperties = fruitsServerProperties;
        this.sdpClient = sdpClient;
        this.sdpServerProperties = sdpServerProperties;
    }

    public void start() throws Exception {
        InitializeMappingMap.initializeMapping(); //初始化 数据
        stringRedisTemplate.opsForValue().set("fruits:porto","8080");
        gameServer.start(fruitsServerProperties.getNettyProperties());
        SdpServer.setChannel(sdpClient.connect(sdpServerProperties.getHost(), sdpServerProperties.getPort()));
    }
}
