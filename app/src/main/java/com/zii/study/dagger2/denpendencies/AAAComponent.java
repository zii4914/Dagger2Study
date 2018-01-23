package com.zii.study.dagger2.denpendencies;

import com.zii.study.dagger2.subcomponent.AA;
import com.zii.study.dagger2.subcomponent.AAModule;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Component(modules = AAModule.class)
public interface AAAComponent {
  //没有写inject方法，因为没有使用对象

  //暴露其provide给其他Component使用
  AA provideAA();
}
