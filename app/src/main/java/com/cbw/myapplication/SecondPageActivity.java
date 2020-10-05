package com.cbw.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * 测试语言切换是否正常
 */
public class SecondPageActivity extends BaseActivity {
    TextView textView;

    public static void enter(Context context) {
        Intent intent = new Intent(context, SecondPageActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.value);
        textView.setText(getResources().getString(R.string.second_page_lungage));
    }
}
