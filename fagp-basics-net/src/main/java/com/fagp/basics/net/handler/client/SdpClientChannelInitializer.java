package com.fagp.basics.net.handler.client;

import com.fagp.basics.net.coder.SdpMessageDecoder;
import com.fagp.basics.net.coder.SdpMessageEncoder;
import com.fagp.basics.net.handler.SdpMessageHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import org.springframework.stereotype.Component;


/**
 *King.Song
 * 数据链接层
 */
@Component
public class SdpClientChannelInitializer extends ChannelInitializer<NioSocketChannel> {

    @Override
    protected void initChannel(NioSocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
        pipeline.addLast(new LengthFieldPrepender(4));
        pipeline.addLast("decoder", new SdpMessageDecoder());
        pipeline.addLast("encoder", new SdpMessageEncoder());

        pipeline.addLast("handler", new SdpClientMessageHandler());


    }
}
