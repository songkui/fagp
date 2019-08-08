package com.fagp.basics.sdp.config;

import com.fagp.basics.core.config.NettyProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource(value ={ "classpath:/config/sdpconfig.properties" }) // 加载文件的路径
@ConfigurationProperties(prefix = "netty")
public class SdpServerProperties extends NettyProperties {
    private int port;

    private int bossCount;

    private int workerCount;

    private boolean keepAlive;

    private int backlog;

    public NettyProperties getNettyProperties(){
        NettyProperties nettyProperties = new NettyProperties();
        nettyProperties.setPort(port);
        nettyProperties.setBossCount(bossCount);
        nettyProperties.setWorkerCount(workerCount);
        nettyProperties.setKeepAlive(keepAlive);
        nettyProperties.setBacklog(backlog);
        return nettyProperties;
    }


}
