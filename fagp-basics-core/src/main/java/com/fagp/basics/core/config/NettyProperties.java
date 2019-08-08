package com.fagp.basics.core.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * King.Song
 * Netty配置信息
 */
@Data
@ToString
@NoArgsConstructor
public class NettyProperties {

    private int port;

    private int bossCount;

    private int workerCount;

    private boolean keepAlive;

    private int backlog;

}
