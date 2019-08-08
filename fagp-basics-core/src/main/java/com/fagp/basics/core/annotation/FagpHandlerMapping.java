package com.fagp.basics.core.annotation;


import com.fagp.basics.core.enm.HandlerType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

/**
 * King.Song
 * handler 方法上面的注解
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FagpHandlerMapping {
	HandlerType value();
}
