package com.fagp.basics.net.send;

import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Auther: SK
 * @Date: 2019/8/9 00:43
 * @Description:
 */
public class ServerResponse {

    /**
     * 服务器响应 客户端请求
     * @param response
     * @param cxt
     */
    public static void sendMsg(ApiProtoBufResponse response, ChannelHandlerContext cxt){
        cxt.writeAndFlush(response);
    }
}
