package com.fagp.basics.core.handler;


import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Description: Handler 接口，所有处理都必须 实现该接口
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
public interface FagpHandler {


    //所有接口 都必须这种样式操作
      void handle(ApiProtoBufRequest request, ChannelHandlerContext ctx);
}
