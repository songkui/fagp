package com.fagp.game.lobby.service;

import com.google.protobuf.GeneratedMessage;
import com.fagp.basics.net.annotation.RequestHandler;
import com.fagp.basics.net.proto.RHMS;
import com.google.protobuf.GeneratedMessageV3;
import org.springframework.stereotype.Service;

@Service
public class LoginRequestService {

	@RequestHandler(RHMS.MsgType.M_LoginRequest)
	public GeneratedMessageV3 doLogin(GeneratedMessageV3 message) {
		RHMS.LoginRequest request = (RHMS.LoginRequest)message;
		
		RHMS.LoginResponse response = RHMS.LoginResponse.newBuilder()
				.setHeader(RHMS.Header.newBuilder().setCode(0).setSuccess(true).setMessage("ok").build())
				.setAccount(request.getAccount())
				.setAge(18)
				.setUid("user001")
				.build();
		
		return response;
	}
	
	@RequestHandler(RHMS.MsgType.M_LogoutRequest)
	public GeneratedMessageV3 doLogout(GeneratedMessageV3 message) {
		RHMS.LoginRequest request = (RHMS.LoginRequest)message;
		
		RHMS.LogoutResponse response = RHMS.LogoutResponse.newBuilder()
				.setHeader(RHMS.Header.newBuilder().setCode(0).setSuccess(true).setMessage("ok").build())
				.setAccount(request.getAccount())
				.setUid("user001")
				.build();
		
		return response;
	}

}
