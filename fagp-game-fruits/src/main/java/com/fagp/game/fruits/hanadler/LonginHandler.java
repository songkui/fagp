package com.fagp.game.fruits.hanadler;

import com.fagp.basics.core.annotation.GameHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.ResponseCode;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.aheader.Header;
import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;
import com.fagp.basics.core.protobuf.lobby.response.LobbyProtoResponse;
import com.fagp.game.fruits.test.TcpTest;
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
    public void doLogin(ApiProtoBufRequest request, ApiProtoBufResponse response) {

        LobbyProtoResponse.LoginResponse responseMsg = LobbyProtoResponse.LoginResponse.newBuilder()
                .setPhone("18615780661").setUid("xxFFFFFFFFFFFFFFFFFFxxx").build();
        response.buildState(ResponseCode.Success);
        response.buildData(responseMsg);

//        new TcpTest().doHttp();
        response.sendMessage();


    }


    @Override
    public void handle(ApiProtoBufRequest request, ApiProtoBufResponse response) {

    }
}
