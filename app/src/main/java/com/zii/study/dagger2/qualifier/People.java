package com.zii.study.dagger2.qualifier;

/**
 * @create Created by Zii on 2018/1/23.
 */

public class People {
  private String name;
  private int age;

  public People(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "People{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
