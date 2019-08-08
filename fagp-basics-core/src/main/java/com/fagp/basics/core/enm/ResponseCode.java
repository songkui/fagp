package com.fagp.basics.core.enm;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: King.Song
 * @Description:
 */
public enum ResponseCode {

    /**
     * 公共
     */
    Success(ResponseCodeType.None, 200, "成功"),
    SystemException(ResponseCodeType.None, 500, "系统异常"),
    Forbidden(ResponseCodeType.None,403,"错误的请求参数"),

    /**
     * 全局返回错误
     * (这种情况出现在请求未进入业务层，在框架层出现的异常错误)
     */
    DataNotFound(ResponseCodeType.Other, 1, "指定数据不存在", "指定%s数据(%s)不存在"),
    IllegalArgument(ResponseCodeType.Other, 2, "参数错误", "传入的参数(%s)不正确"),
    BusinessException(ResponseCodeType.Other, 3, ""),

    UserLoginFailure(ResponseCodeType.Lobby, 1, "用户登陆失效，请重新登陆"),
    UserBDNotExits(ResponseCodeType.Lobby, 2, "指定用户不存在")
    ;


    private final static Map<Integer, ResponseCode> codeMap = Arrays.stream(ResponseCode.values()).collect(Collectors.toMap(ResponseCode::code, code -> code));

    private final int code;
    private  String desc;
    private final String template;
    private final ResponseCodeType type;


    ResponseCode(ResponseCodeType type, int code, String desc) {
        this.code = code;
        this.desc = desc;
        this.type = type;
        this.template = "";
    }

    ResponseCode(ResponseCodeType type, int code, String desc, String template) {
        this.code = code;
        this.desc = desc;
        this.type = type;
        this.template = template;
    }

    public int code() {
        return this.type.code() * 100 + this.code;
    }

    public String desc() {
        return this.desc;
    }

    public String template() {
        return this.template;
    }

    /**
     * 可自定义返回 desc
     * @param desc
     * @return
     */
    public ResponseCode setDesc(String desc){
        this.desc = desc;
        return  this;
    }

    /**
     * @param code 代码
     * @return 转换出来的状态码
     */
    public static ResponseCode parse(Integer code) {
        return codeMap.get(code);
    }

}
