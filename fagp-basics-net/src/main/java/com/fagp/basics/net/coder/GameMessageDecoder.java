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

import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.exception.FagpException;
import com.fagp.basics.core.protobuf.ApiProtoBufRequest;
import com.fagp.basics.core.util.MessageUtil;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 *  游戏服务器〈消息解码器〉
 *
 * @author King.Song
 * @date 2019/8/9 00:05
 */
public class GameMessageDecoder extends MessageToMessageDecoder<ByteBuf> {

  private Logger logger = LoggerFactory.getLogger(GameMessageDecoder.class);

/** *
 * short MESSAGE_FLAG = 0x1425; //消息分割符号 pb length short 2， int 4
 * int cmd; //4
 * int pbLength; // 包长度
 * pb byte[] 请求参数
 * 判断传送客户端传送过来的数据是否按照协议传输，头部信息的大小应该是 short + int +int = 2 + 4+4 = 10
  */
  private static final int HEADER_SIZE = 6;

  private ConcurrentHashMap<Integer, Parser<GeneratedMessageV3>> parserMap = new ConcurrentHashMap<>();

  private final Charset charset;

  public GameMessageDecoder() {
    this.charset = CharsetUtil.UTF_8;
  }

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

    HandlerType msgType = HandlerType.valueOfCode(cmd);
    if (null == msgType){
        logger.error("*******映射HandlerType未配置：FLAG：", MESSAGE_FLAG, "cmd:", "包长：", pbLength );
        throw new FagpException("映射HandlerType未配置，cmd："+cmd);
    }
    Parser<GeneratedMessageV3> parserV3 = parserMap.get(msgType.code());
    if(parserV3 == null){
      parserV3 = MessageUtil.parseMessage(msgType);
      Optional.ofNullable(parserV3).ifPresent(mv3 ->  parserMap.put(msgType.code(), mv3) );
    }
    GeneratedMessageV3 messageV3 = parserV3.parseFrom(bodyByte);
    logger.info("请求参数 "+ messageV3.toString());
    out.add(ApiProtoBufRequest.newBuild().cmd(cmd).pbLength(pbLength).data(messageV3).type(msgType).build());

  }

}