package com.zii.study.dagger2.qualifier;

import dagger.Component;

/**
 * @create Created by Zii on 2018/1/23.
 */
@Component(modules = QualifierModule.class)
public interface QualifierComponent {
  void inject(QualifierUseActivity activity);
}
