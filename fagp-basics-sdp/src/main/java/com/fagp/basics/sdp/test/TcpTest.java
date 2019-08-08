package com.fagp.basics.sdp.test;

import com.fagp.basics.net.test.ProtocolClient;

public class TcpTest {
    public static void main(String[] args) throws Exception{
        int port = 9090;
        new ProtocolClient().connect("localhost", port);
    }
}
