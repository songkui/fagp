package com.fagp.basics.core.enm;

/**
 *King.Song
 */
public enum ResponseCodeType {
    None(0, "无"),
    System(50, "系统"),
    Other(55, "其他"),
    Lobby(61, "大厅"),
    Fruit(71, "水果机")
    ;
    
    private final int code;
    private final String desc;

    ResponseCodeType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }
}
