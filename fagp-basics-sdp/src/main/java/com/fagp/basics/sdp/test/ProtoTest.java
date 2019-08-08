package com.fagp.basics.sdp.test;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.fagp.basics.net.proto.RHMS;

public class ProtoTest {
    public static void main(String[] arg){
        RHMS.LoginResponse loginResponse = RHMS.LoginResponse.newBuilder()
                .setAge(12).setHeader(RHMS.Header.newBuilder().setCode(12).setSuccess(true).setMessage("Sucess"))
                .setAccount("nihao").setUid("sfsdfsd").build();

        GeneratedMessageV3 generatedMessageV3 = null;
    }

    public GeneratedMessageV3 createMsg(){
        return  RHMS.LoginResponse.newBuilder()
                .setAge(12).setHeader(RHMS.Header.newBuilder().setCode(12).setSuccess(true).setMessage("Sucess"))
                .setAccount("nihao").setUid("sfsdfsd").build();
    }
}
