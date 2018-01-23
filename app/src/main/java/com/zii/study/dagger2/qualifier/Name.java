package com.zii.study.dagger2.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Name {
  String value() default "";
}
