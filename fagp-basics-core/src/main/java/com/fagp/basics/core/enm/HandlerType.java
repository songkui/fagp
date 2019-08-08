package com.fagp.basics.core.enm;


import com.fagp.basics.core.protobuf.lobby.request.LobbyProtoRequest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 如果 各个子系统接口数量 多则 把枚举 移动到个子系统 那么就只又各个子系统的接口信息；
 *
 * 目前系统接口较少则定义规则如下
 * 该 枚举 主要是存储 命令cmd 对应的 PB 类
 * 00000位命令  前2位表示子系统位 后三位表示改子系统下面的对应接口
 *
 * 例如：
 *  11000 从 lobby 开始  11001 表示登录  11002 表示积分
 *  21000  水果机； 21001 表示 下注 21002表示退出子游戏；
 *  31000  其他子游戏
 *
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
public enum HandlerType implements IEnumType {
    LoginRequest(11001, LobbyProtoRequest.LoginRequest.class, "登录接口"),
    EFTRequest(11002, LobbyProtoRequest.EFTRequest.class, "资金转账");

    private final int code ;
    private final String desc;
    private final Class msgClass;

    private HandlerType(int code, Class c, String desc){
        this.code = code;
        this.msgClass = c;
        this.desc = desc;
    }

    //转换成 map
    private final static Map<Integer, HandlerType> handlerTypeMap = Arrays.stream(HandlerType.values())
                                                       .collect(Collectors.toMap(HandlerType::code, rtype -> rtype));

    @Override
    public final int code() {
        return this.code;
    }

    @Override
    public final String desc() {
        return this.desc;
    }

    //得到 class
    public final Class getMsgClass(){
        return this.msgClass;
    }

    public final static HandlerType valueOfCode(int cmd){
       return handlerTypeMap.get(cmd);
    }


}
