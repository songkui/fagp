package com.fagp.basics.core.protobuf;

import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.ResponseCode;
import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: 定义返回客户端的Pb 协议
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Data
@ToString
@NoArgsConstructor
public class ApiProtoBufResponse {

    public static final short MESSAGE_FLAG = 0x2425; // 写入PB 消息分割符号 pb length short 2， int 4
    private int cmd; //写入PB 4
    private HandlerType handlerType;
    private int state = 200; //写入PB 状态 200 表示成功 4
    private int pbLength; // 写入PB  包长度

    private GeneratedMessageV3 data; //写入PB  返回前端的数据

    private ChannelHandlerContext context; // chanelConent //

    public static ApiProtoBufResponse newResponse(){
        return new ApiProtoBufResponse();
    }

    public ApiProtoBufResponse buildHandlerType(HandlerType handlerType){
        this.handlerType = handlerType;
        this.cmd = handlerType.code();
        return this;
    }

    public ApiProtoBufResponse buildState(ResponseCode responseCode){
        this.state = responseCode.code();
        return this;
    }

    public ApiProtoBufResponse buildData(GeneratedMessageV3 data){
        this.data = data;
        return this;
    }

    public ApiProtoBufResponse buildContext(ChannelHandlerContext context){
        this.context = context;
        return this;
    }


    //TODO 发送消息 太弱 需进步处理 赶时间暂时放以后处理
    public void sendMessage(){
         context.writeAndFlush(this);
    }


}
