package com.zii.study.dagger2.module;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Component(modules = ModuleUseModule.class)
public interface ModuleUseComponent {
  void inject(ModuleUseActivity activity);
}
