package com.zii.study.dagger2.qualifier;

import dagger.Module;
import dagger.Provides;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Module
public class QualifierModule {
  @Provides
  @Name("XiaoMing")
  public People providerXiaoMing() {
    return new People("小明", 15);
  }

  @Provides
  @Name("XiaoHua")
  public People provideXiaoHua() {
    return new People("小花", 14);
  }
}
