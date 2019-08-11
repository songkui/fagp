package com.fagp.game.fruits.config;

import com.fagp.basics.dc.model.user.UserDomain;
import com.fagp.basics.dc.service.user.UserService;
import com.fagp.basics.net.client.SdpClient;
import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.servers.GameServer;
import com.fagp.game.fruits.test.TcpTest;
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
    private final UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public StartInitialize(GameServer gameServer, SdpClient sdpClient,
                           FruitsServerProperties fruitsServerProperties,
                           SdpServerProperties sdpServerProperties, UserService userService){
        this.gameServer = gameServer;
        this.fruitsServerProperties = fruitsServerProperties;
        this.sdpClient = sdpClient;
        this.userService = userService;
    }

    public void start() throws Exception {
        InitializeMappingMap.initializeMapping(); //初始化 数据
        stringRedisTemplate.opsForValue().set("fruits:porto","8080");
//        TcpTest.doHttp();
        userService.addUser(new UserDomain(90, "userName", "234", "18615780661"));
        gameServer.start(fruitsServerProperties.getNettyProperties());
//        SdpServer.setChannel(sdpClient.connect(sdpServerProperties.getHost(), sdpServerProperties.getPort()));
    }
}
