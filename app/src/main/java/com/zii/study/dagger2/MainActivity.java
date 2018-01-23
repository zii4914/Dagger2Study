package com.zii.study.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zii.study.dagger2.basics.BasicsUseActivity;
import com.zii.study.dagger2.denpendencies.DependenciesActivity;
import com.zii.study.dagger2.module.ModuleUseActivity;
import com.zii.study.dagger2.qualifier.QualifierUseActivity;
import com.zii.study.dagger2.scope.ScopeActivity;
import com.zii.study.dagger2.subcomponent.SubComponentActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void startBasicUseActivity(View view) {
    BasicsUseActivity.start(this);
  }

  public void startModuleUseActivity(View view) {
    ModuleUseActivity.start(this);
  }

  public void startQualifierActivity(View view) {
    QualifierUseActivity.start(this);
  }

  public void startScopeActivity(View view) {
    ScopeActivity.start(this);
  }

  public void startSubComponentActivity(View view) {
    SubComponentActivity.start(this);
  }

  public void startDependenciesActivity(View view) {
    DependenciesActivity.start(this);
  }
}
