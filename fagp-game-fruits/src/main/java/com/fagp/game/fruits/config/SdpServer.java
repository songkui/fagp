package com.fagp.game.fruits.config;


import io.netty.channel.Channel;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @Author King.Song
 * @Date 2019/8/9 0009
 **/
public class SdpServer {

    private static ConcurrentHashMap<String, Channel> channelConcurrentHashMap = new ConcurrentHashMap<>(1);

    public static void setChannel(Channel channel){
        channelConcurrentHashMap.put("test", channel);
    }

    public static Channel getChannel(){
        return channelConcurrentHashMap.get("test");
    }


}
