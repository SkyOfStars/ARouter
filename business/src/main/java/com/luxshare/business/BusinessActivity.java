package com.luxshare.business;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.luxshare.configs.PathConfig;

@Route(path = PathConfig.PAHT_BUSINESSACTIVITY,group = "business")
public class BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
    }
}