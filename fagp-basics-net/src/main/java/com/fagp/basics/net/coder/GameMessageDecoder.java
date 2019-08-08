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
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 *  游戏服务器〈消息解码器〉
 *
 * @author King.Song
 * @date 2019/8/9 00:05
 */
public class GameMessageDecoder extends LengthFieldBasedFrameDecoder {

  private Logger logger = LoggerFactory.getLogger(GameMessageDecoder.class);

/** *
 * short MESSAGE_FLAG = 0x1425; //消息分割符号 pb length short 2， int 4
 * int cmd; //4
 * int pbLength; // 包长度
 * pb byte[] 请求参数
 * 判断传送客户端传送过来的数据是否按照协议传输，头部信息的大小应该是 short + int +int = 2 + 4+4 = 10
  */
  private static final int HEADER_SIZE = 6;

  private ConcurrentHashMap<Integer, GeneratedMessageV3> parserMap = new ConcurrentHashMap<>();

  /**
   * @param maxFrameLength      解码时，处理每个帧数据的最大长度
   * @param lengthFieldOffset   该帧数据中，存放该帧数据的长度的数据的起始位置
   * @param lengthFieldLength   记录该帧数据长度的字段本身的长度
   * @param lengthAdjustment    修改帧数据长度字段中定义的值，可以为负数
   * @param initialBytesToStrip 解析的时候需要跳过的字节数
   * @param failFast            为true，当frame长度超过maxFrameLength时立即报TooLongFrameException异常，为false，读取完整个帧再报异常
   */
  public GameMessageDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment,
                             int initialBytesToStrip, boolean failFast) {
    super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip, failFast);
  }

  @Override
  protected ApiProtoBufRequest decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
    if (in == null) {
      return null;
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
    logger.info("服务器接收请求：FLAG：", MESSAGE_FLAG, "cmd:", "包长：", pbLength );

    ByteBuf buf = in.readBytes(pbLength); //********************需注意************************************
    byte[] bodyByte = new byte[buf.readableBytes()];
    buf.readBytes(bodyByte);

    HandlerType msgType = HandlerType.valueOfCode(cmd);
    if (null == msgType){
        logger.error("*******映射HandlerType未配置：FLAG：", MESSAGE_FLAG, "cmd:", "包长：", pbLength );
        throw new FagpException("映射HandlerType未配置，cmd："+cmd);
    }
    GeneratedMessageV3 messageV3 = parserMap.get(msgType.code());
    if(messageV3 == null){
      messageV3 = MessageUtil.parseMessage(msgType);
      Optional.ofNullable(messageV3).ifPresent(msg ->  parserMap.put(msgType.code(), msg) );
    }

    return ApiProtoBufRequest.newBuild().cmd(cmd).pbLength(pbLength).data(messageV3).type(msgType).build();
  }

}