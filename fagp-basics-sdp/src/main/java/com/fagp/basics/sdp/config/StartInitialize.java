package com.fagp.basics.sdp.config;

import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.tcp.TcpServer;
import com.fagp.basics.sdp.model.UserDomain;
import com.fagp.basics.sdp.service.user.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: SK
 * @Date: 2019/8/4 10:36
 * @Description:
 */
@Component
public class StartInitialize {
    private final TcpServer tcpServer;
    private final SdpServerProperties sdpServerProperties;
    private final UserService userService;

    @Autowired
    public StartInitialize(UserService userService, TcpServer tcpServer, SdpServerProperties sdpServerProperties){
        this.tcpServer = tcpServer;
        this.sdpServerProperties = sdpServerProperties;
        this.userService = userService;
    }

    public void start() throws Exception{
        //初始化 redis
        PageInfo<UserDomain> pageInfo = userService.findAllUser(0, 10);
        pageInfo.getList().stream().forEach(u ->System.out.println(u.getPhone()));
        InitializeMappingMap.initializeMapping(); //初始化 数据
        tcpServer.start(sdpServerProperties.getNettyProperties());
    }
}