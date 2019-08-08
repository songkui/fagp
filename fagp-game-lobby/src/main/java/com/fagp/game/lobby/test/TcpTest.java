package com.fagp.game.lobby.test;

import com.fagp.basics.net.test.ProtocolClient;

public class TcpTest {
    public static void main(String[] args) throws Exception{
        int port = 7878;
        new ProtocolClient().connect("localhost", port);
    }
}
