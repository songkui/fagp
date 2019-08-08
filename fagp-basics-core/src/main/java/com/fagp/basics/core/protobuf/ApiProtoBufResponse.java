package com.fagp.basics.core.protobuf;

import com.fagp.basics.core.enm.ResponseCode;
import com.google.protobuf.GeneratedMessageV3;
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
public class ApiProtoBufResponse {

    private static final short MESSAGE_FLAG = 0x2425; //消息分割符号 pb length short 2， int 4
    private int cmd; //4
    private int state; //状态 200 表示成功 4
    private int pbLength; // 包长度

    private GeneratedMessageV3 data; //返回前端的数据

    public static final class Builder  {
        private ResponseCode responseCode = ResponseCode.Success; //默认为成功
        private int cmd;
        private GeneratedMessageV3 data;

        public Builder() { }

        public Builder cmd(int cmd){
            this.cmd = cmd;
            return this;
        }

        public Builder  code(ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public Builder  data(GeneratedMessageV3 data) {
            this.data = data;
            return this;
        }

        // build 该对象
        public ApiProtoBufResponse build() {
            return new ApiProtoBufResponse(this);
        }

        /**
         *  build ByteBuf
         * @return
         */
        public ByteBuf buildByteBuf() {
            return build().getByteBuf();
        }


    }

    public ApiProtoBufResponse (Builder builder){
        this.cmd = builder.cmd;
        this.state = builder.responseCode.code();
        this.data = builder.data;
    }

    public static Builder newBuild(){
        return new Builder();
    }

    public ByteBuf getByteBuf(){
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeShort(MESSAGE_FLAG);
        byteBuf.writeInt(this.getCmd()); //命令号
        byteBuf.writeInt(this.getState());

        byte[] bytes = null == this.data ? new byte[0] : this.data.toByteArray();
        byteBuf.writeInt(bytes.length); //包长度
        byteBuf.writeBytes(bytes);
        return byteBuf;
    }





}
