 package com.fagp.game.fruits;


import com.fagp.game.fruits.config.StartInitialize;
import com.google.gson.Gson;
import com.fagp.basics.net.ChannelRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) //不连接 数据库
@SpringBootApplication
@EnableScheduling
@ComponentScan( {"com.fagp.game.fruits","com.fagp.basics.engine", "com.fagp.basics.net","com.fagp.basics.dc"})
@MapperScan("com.fagp.basics.dc.dao")
public class FruitsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(FruitsApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Bean(name = "contextRefreshed")
	public ApplicationListener<ContextRefreshedEvent> applicationListener() {
			return event -> {
				StartInitialize nettyServer = event.getApplicationContext().getBean(StartInitialize.class);
				try {
					nettyServer.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			};


	}

	@Bean
	public ChannelRepository channelRepository() {
		return new ChannelRepository();
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
