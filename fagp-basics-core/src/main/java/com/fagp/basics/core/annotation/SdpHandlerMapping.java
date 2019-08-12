package com.fagp.basics.core.annotation;


import com.fagp.basics.core.enm.SdpHandlerType;

import java.lang.annotation.*;

/**
 * King.Song
 * handler 方法上面的注解
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SdpHandlerMapping {
	SdpHandlerType value();
}
