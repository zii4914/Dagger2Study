package com.zii.study.dagger2.scope;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */
@MyScope
@Component(modules = ScopeModule.class)
public interface ScopeComponent {
  void inject(ScopeActivity activity);
}
