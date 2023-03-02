package com.alibaba.android.arouter.demo.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.demo.R;
import com.alibaba.android.arouter.launcher.ARouter;
import com.luxshare.configs.PathConfig;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btn).setOnClickListener(v -> {
            Log.i(TAG, "initView: ");
            ARouter.getInstance().build(PathConfig.PAHT_SECONDACTIVITY, "main").navigation();
        });
        findViewById(R.id.btn_business).setOnClickListener(v -> {
            Log.i(TAG, "initView: ");
            ARouter.getInstance().build(PathConfig.PAHT_BUSINESSACTIVITY,"business").navigation();
        });
    }
}
