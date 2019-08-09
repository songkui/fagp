package com.fagp.basics.net.handler;

import com.fagp.basics.core.constant.ConstantValue;
import com.fagp.basics.net.coder.GameMessageDecoder;
import com.fagp.basics.net.coder.GameMessageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;
import org.springframework.stereotype.Component;


/**
 *King.Song
 * netty处理器初始化
 */
@Component
public class GameChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("encoder", new GameMessageEncoder());
        pipeline.addLast("decoder", new GameMessageDecoder(ConstantValue.MESSAGE_MAX_FRAME_LENGTH,
                ConstantValue.MESSAGE_LENGTH_FIELD_OFFSET, ConstantValue.MESSAGE_LENGTH_FIELD_LENGTH,
                ConstantValue.MESSAGE_LENGTH_ADJUSTMENT, ConstantValue.MESSAGE_INITIAL_BYTES_TO_STRIP, false));

//        pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
        pipeline.addLast(new LengthFieldPrepender(4));
//        pipeline.addLast(new RequestDecoder());
//        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
        pipeline.addLast(new GameMessageHandler());
//        pipeline.addLast("stringHandler", stringHandler);
    }
}
