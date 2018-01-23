package com.zii.study.dagger2.qualifier;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zii.study.dagger2.R;

import javax.inject.Inject;

/**
 * 当一个Module提供两个相同类型的实例的时候，为了区分及指定对应实例，可以使用@Qualifier
 */
public class QualifierUseActivity extends AppCompatActivity {

  @Inject
  @Name("XiaoMing")
  public People mXiaoMing;

  @Inject
  @Name("XiaoHua")
  public People mXiaoHua;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_qualifier_use);

    DaggerQualifierComponent.builder().qualifierModule(new QualifierModule()).build().inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText("小明：" + mXiaoMing.toString() + "\n" + "小花：" + mXiaoHua.toString());
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, QualifierUseActivity.class);
    context.startActivity(starter);
  }
}
