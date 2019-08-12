/*
 * Copyright (C), 2015-2018
 * FileName: ConstantValue
 * Author:   zhao
 * Date:     2018/6/12 11:01
 * Description: 静态数据类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.fagp.basics.core.constant;

/**
 * 〈静态数据类〉
 * @author King.Song
 * @date 2019/8/9 2:30
 * @since 1.0.0
 */
public class ConstantValue {

  public static final String PROJECT_CHARSET = "UTF-8";

  public static final int SO_BACKLOG = 1024;
  public static final int SO_RCVBUF = 1024*64;
  public static final int SO_SNDBUF = 1024*64;

  public static final int MESSAGE_MAX_FRAME_LENGTH = 1024 * 1024;
  public static final int MESSAGE_LENGTH_FIELD_OFFSET = 0;
  public static final int MESSAGE_LENGTH_FIELD_LENGTH = 4   ;
  public static final int MESSAGE_LENGTH_ADJUSTMENT = 0;
  public static final int MESSAGE_INITIAL_BYTES_TO_STRIP = 0;

  private ConstantValue() {
  }

}