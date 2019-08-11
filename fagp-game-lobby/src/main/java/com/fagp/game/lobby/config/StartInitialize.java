package com.fagp.game.lobby.config;

import com.fagp.basics.dc.model.user.UserDomain;
import com.fagp.basics.dc.service.user.UserService;
import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.servers.GameServer;
import com.github.pagehelper.PageInfo;
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
    private final LobbyServerProperties fruitsServerProperties;
    private final UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public StartInitialize(GameServer gameServer,UserService userService, LobbyServerProperties fruitsServerProperties){
        this.gameServer = gameServer;
        this.fruitsServerProperties = fruitsServerProperties;
        this.userService = userService;
    }

    public void start() throws Exception {
        stringRedisTemplate.opsForValue().set("lobby::prot","9090");
        InitializeMappingMap.initializeMapping(); //初始化 数据
        //初始化 redis
        PageInfo<UserDomain> pageInfo = userService.findAllUser(0, 10);
        pageInfo.getList().stream().forEach(u ->System.out.println(u.getPhone()));
        gameServer.start(fruitsServerProperties.getNettyProperties());
    }
}
