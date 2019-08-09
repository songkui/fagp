package com.fagp.game.fruits.config;

import com.fagp.basics.core.config.NettyProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource(value ={ "classpath:/config/sdpconfig.properties" }) // 加载文件的路径
@ConfigurationProperties(prefix = "sdp.server")
public class SdpServerProperties extends NettyProperties {
    private int port;
    private String host;

}
