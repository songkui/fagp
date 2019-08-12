package com.fagp.game.fruits.hanadler;

import com.fagp.basics.core.annotation.GameHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.ResponseCode;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.lobby.response.LobbyProtoResponse;
import com.fagp.basics.net.session.SessionManager;
import com.google.gson.Gson;
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

        int max=100,min=1;
        int random = (int) (Math.random()*(max-min)+min);
       long userID = (11111 + random);
        SessionManager.getInstance().register(SessionManager.getInstance().getSessionByChannel(response.getContext().channel()), userID);


        //成功案例
        LobbyProtoResponse.LoginResponse responseMsg = LobbyProtoResponse.LoginResponse.newBuilder()
                .setPhone("18615780661").setUid("xxxxxxxx").build();
        response.buildState(ResponseCode.Success);
        response.buildData(responseMsg);
        response.sendMessage();

//        //错误信息案例
//        response.sendErrorMessage(ResponseCode.DataNotFound);

    }


    @Override
    public void handle(ApiProtoBufRequest request, ApiProtoBufResponse response) {

    }
}
