package com.fagp.game.lobby.handler;

import com.fagp.basics.core.annotation.GameHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;
import com.fagp.basics.core.protobuf.lobby.response.LobbyProtoResponse;
import com.google.gson.Gson;
import com.google.protobuf.GeneratedMessageV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Service
@Handler
public class LonginHandler implements FagpHandler{
    private Logger logger = LoggerFactory.getLogger(LonginHandler.class);


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private Gson gson;


    @GameHandlerMapping(HandlerType.LoginRequest)
    public GeneratedMessageV3 doLogin(ApiProtoBufRequest request, ApiProtoBufResponse response) {
       LobbyProtoRequest.LoginRequest loginRequest = (LobbyProtoRequest.LoginRequest)request.getMessageV3();

        //将参数传给这个方法就可以实现物理分页了，非常简单。
        stringRedisTemplate.opsForValue().set("user:lobby", "xxxxxxx");
        logger.info("========xxxxxxxxxxxxxxxxxxxxxx===========" );
        return  LobbyProtoResponse.LoginResponse.newBuilder()
                .setPhone("18615780661").setUid("xxxxx").build();

    }


    @Override
    public void handle(ApiProtoBufRequest request, ApiProtoBufResponse response) {

    }
}
