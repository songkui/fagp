/*
 * Copyright (C), 2015-2018
 * FileName: MessageDecoder
 * Author:   zhao
 * Date:     2018/7/16 15:05
 * Description: 消息解码器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.fagp.basics.net.coder;

import com.fagp.basics.core.enm.SdpHandlerType;
import com.fagp.basics.core.exception.FagpException;
import com.fagp.basics.core.protobuf.sdp.SdpProtocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.List;

/**
 *
 *  游戏服务器〈消息解码器〉
 *
 * @author King.Song
 * @date 2019/8/9 00:05
 */
public class SdpMessageDecoder extends MessageToMessageDecoder<ByteBuf> {

  private Logger logger = LoggerFactory.getLogger(SdpMessageDecoder.class);

/** *
 * short MESSAGE_FLAG = 0x1425; //消息分割符号 pb length short 2， int 4
 * int cmd; //4
 * int pbLength; // 包长度
 * pb byte[] 请求参数
 * 判断传送客户端传送过来的数据是否按照协议传输，头部信息的大小应该是 short + int +int = 2 + 4+4 = 10
  */
  private static final int HEADER_SIZE = 6;

  private final Charset charset;

  public SdpMessageDecoder() {
    this.charset = CharsetUtil.UTF_8;
  }

  //-------传输格式---------
  // 第一位分隔符 short 2位
  //第二位 cmd int
  // 第三位 包长度 int
  // 第四位  携带的数据

  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
    if (in == null) {
      return ;
    }

    if (in.readableBytes() < HEADER_SIZE) {
       throw new FagpException("可读信息段比头部信息都小");
    }

    //注意在读的过程中，readIndex的指针也在移动
    short MESSAGE_FLAG  = in.readShort(); // 分隔符
    int cmd = in.readInt(); // 命令ID
    int pbLength = in.readInt(); // 包长

    if (in.readableBytes() < pbLength) {
      logger.error("*******服务器接收请求包信息有误：FLAG：", MESSAGE_FLAG, "cmd:", "包长：", pbLength );
       throw new FagpException("body获取长度" + pbLength + ",实际长度没有达到");
    }
    logger.info("服务器接收请求! FLAG "+ MESSAGE_FLAG + "cmd :"+cmd +" 包长 "+ pbLength );

    ByteBuf buf = in.readBytes(pbLength); //********************需注意************************************
    byte[] bodyByte = new byte[buf.readableBytes()];
    buf.readBytes(bodyByte);

    SdpHandlerType msgType = SdpHandlerType.valueOfCode(cmd);
    if (null == msgType){
        logger.error("*******映射HandlerType未配置：FLAG：", MESSAGE_FLAG, "cmd:", "包长：", pbLength );
        throw new FagpException("映射HandlerType未配置，cmd："+cmd);
    }

    SdpProtocol.SdpProtoBuf msg = SdpProtocol.SdpProtoBuf.parseFrom(bodyByte);
    logger.info("请求参数 "+ msg.toString());
//    out.add(ApiProtoBufRequest.newBuild().cmd(cmd).pbLength(pbLength).data(msg).sdpType(msgType).build());

  }

}