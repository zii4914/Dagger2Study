package com.zii.study.dagger2.scope;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zii.study.dagger2.R;

import javax.inject.Inject;

/**
 * 本身@Scope并不控制对象的生命周期，其生命周期其实还是看生成的 Component 对象的生命周期。
 * Note:对比{@link com.zii.study.dagger2.basics.BasicsUseActivity}
 */
public class ScopeActivity extends AppCompatActivity {

  @Inject
  public Tester mTester1;

  @Inject
  public Tester mTester2;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scope);

    DaggerScopeComponent.builder().scopeModule(new ScopeModule()).build().inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText("Tester1:" + (mTester1 == null ? null : mTester1.toString())
        + "\n" + "Tester2:" + (mTester2 == null ? null : mTester2.toString())
    );
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, ScopeActivity.class);
    context.startActivity(starter);
  }
}
