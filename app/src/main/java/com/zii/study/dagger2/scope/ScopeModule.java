package com.zii.study.dagger2.scope;

import dagger.Module;
import dagger.Provides;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Module
public class ScopeModule {

  @Provides
  @MyScope
  public Tester provideTester() {
    return new Tester();
  }
}
