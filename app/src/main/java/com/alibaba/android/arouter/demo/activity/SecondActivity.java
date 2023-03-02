package com.alibaba.android.arouter.demo.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.demo.R;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.luxshare.configs.PathConfig;

@Route(path = PathConfig.PAHT_SECONDACTIVITY ,group = "main")
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
