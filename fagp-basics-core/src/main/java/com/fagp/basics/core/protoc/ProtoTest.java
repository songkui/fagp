package com.fagp.basics.core.protoc;

import com.fagp.basics.core.protoc.protomsg.LoginRequest;
import com.google.protobuf.InvalidProtocolBufferException;
import com.fagp.basics.core.protoc.protomsg.Header;

public class ProtoTest {


    public static void main(String[] arg){
       Header.GameRequestHeader gameHeader =  Header.GameRequestHeader.newBuilder().setCmd(1001).setMagic(12321).setVersion(1).build();
//       System.out.println(gameHeader.toString());
//        System.out.println("===== gps Byte 开始=====");
//        for(byte b : gameHeader.toByteArray()){
//            System.out.print(b);
//        }
//
//        System.out.println("\n" + "bytes长度" + gameHeader.toByteString().size());
//        System.out.println("===== gps Byte 结束 =====");
//
//        System.out.println("===== 使用gps 反序列化生成对象开始 =====");
//        Header.GameRequestHeader gameHeader1= null;
//            try {
//                gameHeader1 = Header.GameRequestHeader.parseFrom(gameHeader.toByteArray());
//            } catch (InvalidProtocolBufferException e) {
//                e.printStackTrace();
//            }
//
//        System.out.print(gameHeader1.toString());
//        System.out.println("===== 使用gps 反序列化生成对象结束 =====");

       LoginRequest loginRequest = LoginRequest.newBuilder().setHeader(gameHeader).setPhone("18615780661").setPassword("123456").build();
        System.out.println(loginRequest.toString());

        try {
            System.out.println(LoginRequest.parseFrom(loginRequest.toByteArray()));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }


    }
}
