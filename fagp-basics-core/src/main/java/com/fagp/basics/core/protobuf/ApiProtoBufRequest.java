package com.fagp.basics.core.protobuf;

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
 * @Description: 定义返回客户端的Pb 协议
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Data
@ToString
@NoArgsConstructor
public class ApiProtoBufRequest {

    private static final short MESSAGE_FLAG = 0x1425; //消息分割符号 pb length short 2， int 4
    private int cmd; //4
    private int pbLength; // 包长度

    private GeneratedMessageV3 messageV3;

    public static final class Builder  {
        private int cmd;
        private ByteBuf data;

        private Parser<?> parseFrom;
        public Builder() { }

        public Builder cmd(int cmd){
            this.cmd = cmd;
            return this;
        }

        public Builder  data(ByteBuf data) {
            this.data = data;
            return this;
        }
        public Builder parseFrom(Parser<?> parseFrom){
            this.parseFrom = parseFrom;
            return this;
        }

        // build
        public ApiProtoBufRequest build() throws FagpException, InvalidProtocolBufferException {
            ApiProtoBufRequest apiProtoBufRequest = new ApiProtoBufRequest();
            if (this.data.readableBytes()<6){
                throw new FagpException(ResponseCode.Forbidden);
            }

            if (this.data.readableBytes()>45222){
                throw new FagpException(ResponseCode.Forbidden);
            }

            apiProtoBufRequest.cmd = this.data.readInt();
            apiProtoBufRequest.pbLength = this.data.readInt();

            byte[] protobufBytes = new byte[this.data.readableBytes()];
            this.data.readBytes(protobufBytes);
            GeneratedMessageV3 requestMessage = (GeneratedMessageV3) this.parseFrom.parseFrom(protobufBytes);
            apiProtoBufRequest.messageV3 = requestMessage;
            return apiProtoBufRequest;
        }


    }


    public static Builder newBuild(){
        return new Builder();
    }





}
