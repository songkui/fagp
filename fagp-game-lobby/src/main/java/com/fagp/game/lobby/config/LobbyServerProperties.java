package com.fagp.game.lobby.config;

import com.fagp.basics.core.config.NettyProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value ={ "classpath:/config/sdpconfig.properties" }) // 加载文件的路径
@ConfigurationProperties(prefix = "netty")
public class LobbyServerProperties extends NettyProperties {
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

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public int getBossCount() {
        return bossCount;
    }

    @Override
    public void setBossCount(int bossCount) {
        this.bossCount = bossCount;
    }

    @Override
    public int getWorkerCount() {
        return workerCount;
    }

    @Override
    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    @Override
    public boolean isKeepAlive() {
        return keepAlive;
    }

    @Override
    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Override
    public int getBacklog() {
        return backlog;
    }

    @Override
    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }
}
