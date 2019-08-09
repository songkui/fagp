package com.fagp.game.fruits.test;


import com.fagp.basics.core.pojo.LombokTest;
import com.fagp.basics.core.protobuf.sdp.SdpProtocol;
import com.fagp.basics.core.util.HttpApacheUtil;
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
        new ProtocolClient().connect("localhost", port);
    }


    public void doHttp(){
        String url = "http://127.0.0.1:8080/user/all";
        Map<String, Object> map = new HashMap<>();
        map.put("pageNum", "0");
        map.put("pageSize", "10");
        Long crtime = System.currentTimeMillis();
        String json = null;
        for (int i = 0 ; i<1000; i++){

            try {
                json = HttpApacheUtil.request("GET", url, map);//http://127.0.0.1:8080/user/all?pageSize=10&pageNum=0");
            } catch (Exception e) {
                e.printStackTrace();
            }
//        System.out.println(json);

        }
        System.out.println("+++++++++++++++++++++++" + (System.currentTimeMillis() -crtime) );
    }
}
