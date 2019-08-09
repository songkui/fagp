/*
 * Copyright (C), 2015-2018
 * FileName: MessageEncoder
 * Author:   zhao
 * Date:     2018/7/16 14:58
 * Description: 消息编码器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.fagp.basics.net.coder;

import com.fagp.basics.core.exception.FagpException;
import com.fagp.basics.core.protobuf.ApiProtoBufResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 *
 * 编码器
 *
 * @author King.Song
 * @date 2019/8/9 1:20
 */
public class GameMessageEncoder extends MessageToByteEncoder<ApiProtoBufResponse> {

  @Override
  protected void encode(ChannelHandlerContext ctx, ApiProtoBufResponse msg, ByteBuf out) throws FagpException {
    if (null == msg) {
      throw new FagpException("msg is null");
    }
     out = msg.getByteBuf();
  }

}
