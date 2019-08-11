package com.fagp.basics.sdp.handler;

import com.fagp.basics.core.annotation.GameHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.ResponseCode;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;
import com.fagp.basics.core.protobuf.lobby.response.LobbyProtoResponse;
import com.fagp.basics.dc.dao.user.UserDao;
import com.fagp.basics.dc.model.user.UserDomain;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private UserDao userDao;//这里会报错，但是并不会影响

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private Gson gson;


    @GameHandlerMapping(HandlerType.LoginRequest)
    public void doLogin(ApiProtoBufRequest request, ApiProtoBufResponse response) {
       LobbyProtoRequest.LoginRequest loginRequest = (LobbyProtoRequest.LoginRequest)request.getMessageV3();

        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(0, 10);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        stringRedisTemplate.opsForValue().set("user:2", gson.toJson(result));
        logger.info("==================="+ gson.toJson(result));

       LobbyProtoResponse.LoginResponse responseMsg = LobbyProtoResponse.LoginResponse.newBuilder()
               .setPhone("18615780661").setGcode(125).build();
        response.buildState(ResponseCode.Success);
        response.buildData(responseMsg);
        response.sendMessage();

    }


    @Override
    public void handle(ApiProtoBufRequest request, ApiProtoBufResponse response) {

    }
}
