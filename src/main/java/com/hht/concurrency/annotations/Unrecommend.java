package com.hht.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标识 不推荐写法 的类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Unrecommend {
    String value() default "";
}
