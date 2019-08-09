package com.fagp.basics.sdp;

import com.google.gson.Gson;
import com.fagp.basics.net.ChannelRepository;
import com.fagp.basics.sdp.config.StartInitialize;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan( {"com.fagp.basics.sdp", "com.fagp.basics.net"})
@MapperScan("com.fagp.basics.sdp.dao")
public class SdpApplication {

	private Logger logger = LoggerFactory.getLogger(SdpApplication.class);
	public static void main(String[] args) {
		try {
			SpringApplication.run(SdpApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
//
//	@Bean(name = "contextRefreshed")
//	public ApplicationListener<ContextRefreshedEvent> applicationListener() {
//		return event -> {
//			StartInitialize nettyServer = event.getApplicationContext().getBean(StartInitialize.class);
//			try {
//				nettyServer.start();
//			} catch (Exception e) {
//				e.printStackTrace();
//				logger.error(e.getMessage());
//			}
//		};
//	}
//
//	@Bean
//	public ChannelRepository channelRepository() {
//		return new ChannelRepository();
//	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
