package com.fagp.basics.sdp.handler;

import com.fagp.basics.core.annotation.FagpHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.handler.FagpHandler;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import com.fagp.basics.core.protobuf.aheader.Header;
import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;
import com.fagp.basics.core.protobuf.lobby.response.LobbyProtoResponse;
import com.fagp.basics.net.send.ServerResponse;
import com.fagp.basics.sdp.dao.UserDao;
import com.fagp.basics.sdp.model.UserDomain;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.nio.channels.Channel;
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


    @FagpHandlerMapping(HandlerType.LoginRequest)
    public void doLogin(ApiProtoBufRequest request, ChannelHandlerContext ctx) {
       LobbyProtoRequest.LoginRequest loginRequest = (LobbyProtoRequest.LoginRequest)request.getMessageV3();

        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(0, 10);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        stringRedisTemplate.opsForValue().set("user:2", gson.toJson(result));
        logger.info("==================="+ gson.toJson(result));

       LobbyProtoResponse.LoginResponse responseMsg = LobbyProtoResponse.LoginResponse.newBuilder().setHeader(Header.GameResponseHeader.newBuilder().setCmd(HandlerType.LoginRequest.code()).setVersion(1))
               .setPhone("18615780661").setVip("xxxxx").build();

        ServerResponse.sendMsg(ApiProtoBufResponse.newBuild().cmd(request.getCmd()).data(responseMsg).build(), ctx);

    }


    @Override
    public void handle(ApiProtoBufRequest request, ChannelHandlerContext ctx) {

    }
}
