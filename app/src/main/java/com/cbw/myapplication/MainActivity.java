package com.cbw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cbw.myapplication.utils.LocalManageUtil;

public class MainActivity extends BaseActivity {

    TextView value;
    Button btnSwitchLaguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = findViewById(R.id.value);
        @SuppressLint({"StringFormatInvalid", "LocalSuppress"}) String nowLanguage = getString(R.string.value_string, LocalManageUtil.getSelectLanguage(this));
        value.setText(nowLanguage);

        btnSwitchLaguage = findViewById(R.id.btn_switch);

        btnSwitchLaguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SettingActivity.enter(MainActivity.this);
            }
        });

        findViewById(R.id.btn_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondPageActivity.enter(MainActivity.this);
            }
        });

    }



    public static void reStart(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
