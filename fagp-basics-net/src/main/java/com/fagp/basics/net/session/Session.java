package com.fagp.basics.net.session;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈Session会话，包括管道及用户信息〉
 * 里面的所有信息都需要交由SessionManager操作
 * 外部无法直接访问到这个类的方法
 *
 * @author King.Song
 * @date 2019/8/11 16:15
 */
public class Session {

  private static final Logger logger = LoggerFactory.getLogger(Session.class);

  /**
   * 与客户端的管道
   */
  private final Channel channel;
  /**
   * 用户信息
   * 用户信息可能为空。
   * 只有在register(登录)之后，里面才会赋值
   */
  private Long userId;
  /**
   * 创建时间
   */
  private final long createTime;

  private final HashMap<String, Object> hashMap;

  Session(Channel channel) {
    this.channel = channel;
    this.createTime = System.currentTimeMillis();
    hashMap = new HashMap<>();
  }

  /**
   * 玩session里面写入user，一般是在登录之后调用a
   *
   * @param user 用户 信息
   */
  void registerUser(Long user) {
    this.userId = user;
  }

  /**
   * 关闭与客户端的连接
   */
  void close() {
    if (channel == null) {
      return;
    }
    try {
      if (channel.isActive() || channel.isOpen()) {
        channel.close().sync();
      }
    } catch (InterruptedException e) {
      logger.error("channel.close find error ", e);
    }

  }

  public Long getUserId() {
    return userId;
  }

  public Channel getChannel() {
    return channel;
  }

  public void put(String key, Object value) {
    hashMap.put(key, value);
  }

  public Object getByKey(String key) {
    return hashMap.getOrDefault(key, null);
  }

}