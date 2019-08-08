package com.fagp.basics.core.dto;

import lombok.*;

@Data // 自动加载set get 方法 不需要手动添加

@ToString
@EqualsAndHashCode //(callSuper = false)
@NoArgsConstructor //无参数 构造方法
//@AllArgsConstructor //全参 构造方法
public class LombokTest {

    private String str1;
    private String str2;
    private int int1;

    public static void test(){
        LombokTest lombokTest = new LombokTest();
        lombokTest.setInt1(1);
    }
}
