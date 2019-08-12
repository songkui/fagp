package com.fagp.basics.net.session;

import io.netty.util.AttributeKey;

/**
 * 〈一句话功能简述〉<br>
 * 〈session相关的AttributeKey〉
 *
 * @author King.Song
 * @date 2019/8/11 16:15
 */
public class SessionAttributeKey {

  /**
   * AttributeKey Session
   */
  public static final AttributeKey<Session> SESSION = AttributeKey.newInstance("SESSION");
}