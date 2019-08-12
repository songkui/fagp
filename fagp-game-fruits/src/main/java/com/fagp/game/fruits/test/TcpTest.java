package com.fagp.game.fruits.test;


import com.fagp.basics.core.pojo.LombokTest;
import com.fagp.basics.core.protobuf.sdp.SdpProtocol;
import com.fagp.basics.core.util.HttpApacheUtil;
import com.fagp.basics.core.util.HttpUtils;
import com.fagp.basics.net.client.ProtocolClient;
import com.fagp.basics.net.client.SdpClient;
import com.fagp.game.fruits.config.SdpServer;
import com.google.gson.Gson;
import io.netty.channel.Channel;

import java.util.HashMap;
import java.util.Map;


public class TcpTest {
    public static void main(String[] args) throws Exception {
        int port = 8989;
        new ProtocolClient().connect("127.0.0.1", port);
//        Channel channel = SdpServer.getChannel();

    }


//    public static void doHttp(){
//        Long start = System.currentTimeMillis();
//        String url = "http://127.0.0.1:8080/user/all";
//        Map<String, String> map = new HashMap<>();
//        map.put("pageNum", "0");
//        map.put("pageSize", "10");
//        String json = null;
//        for (int i = 0 ; i<100; i++){
//
//            try {
//                String result = HttpUtils.sendGet(url, map);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
////        System.out.println(json);
//
//        }
//        System.out.println("+++++++++++++++++++++" + (System.currentTimeMillis() -start) );
//    }
}
