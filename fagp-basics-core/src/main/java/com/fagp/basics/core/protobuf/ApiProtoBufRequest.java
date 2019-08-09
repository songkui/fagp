package com.fagp.basics.core.protobuf;

import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.ResponseCode;
import com.fagp.basics.core.exception.FagpException;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 由于赶时间 ApiProtoBufRequest 没有很好的封装
 * @Description: 定义返回客户端的Pb 协议
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Data
@ToString
@NoArgsConstructor
public class  ApiProtoBufRequest {

    private static final short MESSAGE_FLAG = 0x1425; //消息分割符号 pb length short 2， int 4
    private int cmd; //4
    private int pbLength; // 包长度

    private GeneratedMessageV3 messageV3;

    private HandlerType handlerType; // 业务需要 不属于pb 传输

    public static final class Builder  {
        private int cmd;
        private int pbLength; // 包长度
        private HandlerType handlerType;
        private GeneratedMessageV3 messageV3;

        public Builder() { }

        public Builder cmd(int cmd){
            this.cmd = cmd;
            return this;
        }

        public Builder pbLength(int pbLength){
            this.pbLength = pbLength;
            return this;
        }

        public Builder  data(GeneratedMessageV3 data) {
            this.messageV3 = data;
            return this;
        }

        public Builder type(HandlerType type){
            this.handlerType = type;
            return this;

        }
        // build
        public ApiProtoBufRequest build()  {
            ApiProtoBufRequest apiProtoBufRequest = new ApiProtoBufRequest();
            apiProtoBufRequest.cmd = this.cmd;
            apiProtoBufRequest.pbLength = this.pbLength;
            apiProtoBufRequest.messageV3 = this.messageV3;
            apiProtoBufRequest.handlerType = this.handlerType;
            return apiProtoBufRequest;
        }

    }


    public static Builder newBuild(){
        return new Builder();
    }





}
