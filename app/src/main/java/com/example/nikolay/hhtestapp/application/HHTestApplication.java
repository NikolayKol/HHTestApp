package com.example.nikolay.hhtestapp.application;

import android.app.Application;

/**
 * Created by nikolay on 11.09.17.
 */

public class HHTestApplication extends Application {

    private static HHTestApplication hhTestApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        hhTestApplication = this;
    }

    public static HHTestApplication get() {
        return hhTestApplication;
    }
}
