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
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 *
 * 编码器
 *
 * @author King.Song
 * @date 2019/8/9 1:20
 */
public class SdpMessageEncoder extends MessageToByteEncoder<ApiProtoBufResponse> {

  @Override
  protected void encode(ChannelHandlerContext ctx, ApiProtoBufResponse response, ByteBuf out) throws FagpException {
    if (null == response) {
      throw new FagpException("msg is null");
    }
    //-------传输格式---------
    // 第一位分隔符 short 2位
    //第二位 cmd int
    // 第三位 包长度 int
    // 第四位  携带的数据

    //    //这个得到 btype；
    out.writeShort(response.MESSAGE_FLAG);
    out.writeInt(response.getCmd()); //命令号
    byte[] bytes = null == response.getData() ? new byte[0] : response.getData().toByteArray();
    out.writeInt(bytes.length); //包长度
    out.writeBytes(bytes);

  }

}
