package com.zii.study.dagger2.module;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * @create Created by Zii on 2018/1/23.
 */

@Module
public class ModuleUseModule {

  @Provides
  public Gson provideGson() {
    return new Gson();
  }

}
