package com.zii.study.dagger2.denpendencies;

import com.zii.study.dagger2.subcomponent.BBModule;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Component(modules = BBModule.class, dependencies = AAAComponent.class)
public interface BBBComponent {
  void inject(DependenciesActivity activity);
}
