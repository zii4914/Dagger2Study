package com.zii.study.dagger2.subcomponent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zii.study.dagger2.R;

import javax.inject.Inject;

/**
 * AAComponent与BBComponent紧紧耦合在一起，表现出明显的依赖关系
 */
public class SubComponentActivity extends AppCompatActivity {

  @Inject
  public BB mBB;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_component);

    AAComponent aaComponent = DaggerAAComponent.builder().aAModule(new AAModule()).build();

    BBComponent bbComponent = aaComponent.plus(new BBModule());

    bbComponent.inject(this);

    TextView tv = findViewById(R.id.textView);
    tv.setText(""
            + "BB:" + (mBB == null ? null : mBB.toString())
//        + "\n" + "Tester2:" + (mTester2 == null ? null : mTester2.toString())
    );
  }

  public static void start(Context context) {
    Intent starter = new Intent(context, SubComponentActivity.class);
    context.startActivity(starter);
  }

}
