/*
 * Copyright (C), 2015-2018
 * FileName: SessionAttributeKey
 * Author:   zhao
 * Date:     2018/6/22 16:12
 * Description: session相关的AttributeKey
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
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