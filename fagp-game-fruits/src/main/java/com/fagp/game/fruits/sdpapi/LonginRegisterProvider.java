package com.fagp.game.fruits.sdpapi;

import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.annotation.SdpHandlerMapping;
import com.fagp.basics.core.enm.SdpHandlerType;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.sdp.SdpProtocol;
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
public class LonginRegisterProvider implements FagpHandler{
    private Logger logger = LoggerFactory.getLogger(LonginRegisterProvider.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private Gson gson;


    @SdpHandlerMapping(SdpHandlerType.LoginRegister)
    public void doLogin(ApiProtoBufRequest request) {
        SdpProtocol.SdpProtoBuf buf = (SdpProtocol.SdpProtoBuf) request.getMessageV3();
//       LobbyProtoRequest.LoginRequest loginRequest = (LobbyProtoRequest.LoginRequest)request.getMessageV3();
//
//        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(0, 10);
//        List<UserDomain> userDomains = userDao.selectUsers();
//        PageInfo result = new PageInfo(userDomains);
//        stringRedisTemplate.opsForValue().set("user:2", gson.toJson(result));
//        logger.info("==================="+ gson.toJson(result));
//
//       LobbyProtoResponse.LoginResponse responseMsg = LobbyProtoResponse.LoginResponse.newBuilder().setHeader(Header.GameResponseHeader.newBuilder().setCmd(HandlerType.LoginRequest.code()).setVersion(1))
//               .setPhone("18615780661").setVip("xxxxx").build();
//        response.buildState(ResponseCode.Success);
//        response.buildData(responseMsg);
//        response.sendMessage();

    }


    @Override
    public void handle(ApiProtoBufRequest request, ApiProtoBufResponse response) {

    }

    public void doTest(String xx){
//        sfsdfsdfx s

    }
}
