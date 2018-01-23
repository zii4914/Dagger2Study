package com.zii.study.dagger2.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScope {
}
