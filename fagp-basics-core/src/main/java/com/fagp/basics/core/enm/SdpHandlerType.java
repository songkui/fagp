package com.fagp.basics.core.enm;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
public enum SdpHandlerType implements IEnumType {
    LoginRegister(10001, "登录接口"),
    Update(9001,  "更新数据");

    private final Integer code ;
    private final String desc;

    private SdpHandlerType(Integer code,  String desc){
        this.code = code;
        this.desc = desc;
    }

    //转换成 map
    private final static Map<Integer, SdpHandlerType> handlerTypeMap = Arrays.stream(SdpHandlerType.values())
                                                       .collect(Collectors.toMap(SdpHandlerType::code, rtype -> rtype));

    @Override
    public final Integer code() {
        return this.code;
    }

    @Override
    public final String desc() {
        return this.desc;
    }

    public final static SdpHandlerType valueOfCode(int cmd){
       return handlerTypeMap.get(cmd);
    }


}
