package com.zii.study.dagger2.module;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.zii.study.dagger2.R;

import javax.inject.Inject;

/**
 * 如果希望注入 第三方库的势力(无法在其构造函数中标记@Inject)，可以使用@Module
 */
public class ModuleUseActivity extends AppCompatActivity {

  @Inject
  public Gson mGson;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_module);

    DaggerModuleUseComponent.builder().moduleUseModule(new ModuleUseModule()).build().inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText("Gson:" + (mGson != null ? mGson.toString() : null));
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, ModuleUseActivity.class);
    context.startActivity(starter);
  }
}
