package com.fagp.basics.core.config;

import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.handler.FagpHandler;
import com.google.protobuf.GeneratedMessageV3;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Method;

/**
 * @Description:  处理映射信息
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HandlerMappingInfo {

    private HandlerType handlerType;
    private Method method;
    private FagpHandler handler;
    private GeneratedMessageV3 message;

}
