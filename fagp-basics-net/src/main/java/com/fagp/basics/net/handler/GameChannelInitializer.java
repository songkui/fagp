package com.fagp.basics.net.handler;

import com.fagp.basics.core.constant.ConstantValue;
import com.fagp.basics.net.coder.GameMessageDecoder;
import com.fagp.basics.net.coder.GameMessageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import org.springframework.stereotype.Component;


/**
 *King.Song
 * netty处理器初始化
 */
@Component
public class GameChannelInitializer extends ChannelInitializer<NioSocketChannel> {

    @Override
    protected void initChannel(NioSocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new LengthFieldBasedFrameDecoder(ConstantValue.MESSAGE_MAX_FRAME_LENGTH, 0, 4, 0, 4));
        pipeline.addLast(new LengthFieldPrepender(4));
        pipeline.addLast("decoder", new GameMessageDecoder());
        pipeline.addLast("encoder", new GameMessageEncoder());

        pipeline.addLast("handler", new GameMessageHandler());

    }
}
