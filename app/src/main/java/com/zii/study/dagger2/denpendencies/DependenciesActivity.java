package com.zii.study.dagger2.denpendencies;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zii.study.dagger2.R;
import com.zii.study.dagger2.subcomponent.AAModule;
import com.zii.study.dagger2.subcomponent.BB;
import com.zii.study.dagger2.subcomponent.BBModule;

import javax.inject.Inject;

/**
 * 直接使用{@link com.zii.study.dagger2.subcomponent.AA}，{@link com.zii.study.dagger2.subcomponent.BB}
 * 及{@link com.zii.study.dagger2.subcomponent.AAModule}，{@link com.zii.study.dagger2.subcomponent.BBModule}
 * <p>
 * 1.AAAComponent暴露 需要被其他Component以来的 provide实例
 * 2.BBBComponent dependencies AAAComponent
 * 3.inject
 * <p>
 * 这样使用Component关系相对独立
 */
public class DependenciesActivity extends AppCompatActivity {

  @Inject
  public BB mBB;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dependencies);

    AAAComponent aaaComponent = DaggerAAAComponent.builder().aAModule(new AAModule()).build();

    BBBComponent bbbComponent = DaggerBBBComponent.builder().bBModule(new BBModule()).aAAComponent(aaaComponent).build();

    bbbComponent.inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText(""
        + (mBB == null ? null : mBB.toString())
    );
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, DependenciesActivity.class);
    context.startActivity(starter);
  }
}
