package com.zii.study.dagger2.subcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Module
public class BBModule {

  @Provides
  public BB provideBB(AA aa) {
    return new BB(aa);
  }
}
