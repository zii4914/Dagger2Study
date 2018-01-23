package com.zii.study.dagger2.subcomponent;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */

@Component(modules = AAModule.class)
public interface AAComponent {
  BBComponent plus(BBModule bbModule);
}