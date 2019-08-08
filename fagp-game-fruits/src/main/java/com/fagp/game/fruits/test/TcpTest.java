package com.fagp.game.fruits.test;

import com.fagp.basics.net.test.ProtocolClient;

public class TcpTest {
    public static void main(String[] args) throws Exception{
        int port = 8989;
        new ProtocolClient().connect("localhost", port);
    }
}
