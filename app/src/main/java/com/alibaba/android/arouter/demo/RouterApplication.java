package com.alibaba.android.arouter.demo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class RouterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebugTest()) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);
    }

    private boolean isDebugTest() {
        return true;
    }
}
