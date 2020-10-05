package com.cbw.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.cbw.myapplication.utils.LocalManageUtil;

public class SettingActivity extends BaseActivity {

    TextView tv_user_select;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        tv_user_select = findViewById(R.id.tv_user_select);

        String nowLungage = getString(R.string.language_select, LocalManageUtil.getSelectLanguage(this));
        tv_user_select.setText(nowLungage);

        click();
    }

    private void click() {
        //切换中文
        findViewById(R.id.btn_cn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectLanguage(1);
            }
        });


        //切换英文
        findViewById(R.id.btn_en).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectLanguage(2);
            }
        });

    }


    public static void enter(Context context) {
        Intent intent = new Intent(context, SettingActivity.class);
        context.startActivity(intent);
    }

    private void selectLanguage(int select) {
        LocalManageUtil.saveSelectLanguage(this, select);
        MainActivity.reStart(this);
    }

}
