package com.zii.study.dagger2.subcomponent;

import dagger.Subcomponent;

/**
 * @create Created by Zii on 2018/1/23.
 */

@Subcomponent(modules = BBModule.class)
public interface BBComponent {
  void inject(SubComponentActivity activity);
}
