package com.fagp.game.fruits.config;


import io.netty.channel.Channel;

/**
 * @Description: TODO
 * @Author King.Song
 * @Date 2019/8/9 0009
 **/
public class SdpServer {

    private static Channel channel;

    public static void setChannel(Channel channel){
        channel = channel;
    }

    public static Channel getChannel(){
        return channel;
    }


}
