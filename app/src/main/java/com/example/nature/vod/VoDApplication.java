package com.example.nature.vod;

import android.app.Application;
import android.content.Context;


public class VoDApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        VoDApplication.context = getApplicationContext();
    }

    // Method that provides Application Context
    public static Context getAppContext() {
        return VoDApplication.context;
    }
}
