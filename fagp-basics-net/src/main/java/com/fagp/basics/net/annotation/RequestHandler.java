package com.fagp.basics.net.annotation;

import com.fagp.basics.net.proto.RHMS;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestHandler {

	RHMS.MsgType value();
}
