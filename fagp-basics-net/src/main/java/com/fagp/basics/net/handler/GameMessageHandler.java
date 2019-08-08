/*
 * Copyright (C), 2015-2018
 * FileName: TcpMessageStringHandler
 * Author:   zhao
 * Date:     2018/6/12 15:01
 * Description: tcp消息处理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.fagp.basics.net.handler;

import com.fagp.basics.core.config.HandlerMappingInfo;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.net.config.InitializeMappingMap;
import com.fagp.basics.net.listener.NetworkListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * 〈tcp消息处理〉
 * @author King.Song
 * @date 2019/8/9 00:05
 */
@Component
@Scope("prototype")
public class GameMessageHandler extends SimpleChannelInboundHandler<ApiProtoBufRequest> {

  private Logger logger = LoggerFactory.getLogger(GameMessageHandler.class);

  @Autowired
  private NetworkListener listener;

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, ApiProtoBufRequest msg) {
    if (null == msg || 0 == msg.getCmd()){
      return;
    }
    try {
      HandlerMappingInfo handlerMappingInfo = InitializeMappingMap.getMapping(msg.getHandlerType().code());
      handlerMappingInfo.getMethod().invoke(handlerMappingInfo.getHandler(), msg, ctx);
    } catch (Exception e) {
      logger.error("************请求获取 mappingInfo 异常", e.getMessage(), " ,  CMD：", msg.getCmd());
      e.printStackTrace();
    }

  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) {
//    listener.onConnected(ctx);
  }

  @Override
  public void channelInactive(ChannelHandlerContext ctx) {
//    listener.onDisconnected(ctx);
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable throwable) {
//    listener.onExceptionCaught(ctx, throwable);
  }
}