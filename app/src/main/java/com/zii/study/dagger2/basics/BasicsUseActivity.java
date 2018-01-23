package com.zii.study.dagger2.basics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zii.study.dagger2.R;

import javax.inject.Inject;

/**
 * 基础用法
 * Note:每次会provide不同的实例
 */
public class BasicsUseActivity extends AppCompatActivity {
  @Inject
  public A1 mA1;

  @Inject
  public A1 mA1_2;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_basics_use);

    DaggerBasicsUseComponent.builder().build().inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText("A1:" + (mA1 != null ? mA1.toString() : null) + "\n"
        + "A1_2:" + (mA1_2 != null ? mA1_2.toString() : null)
    );
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, BasicsUseActivity.class);
    context.startActivity(starter);
  }
}
