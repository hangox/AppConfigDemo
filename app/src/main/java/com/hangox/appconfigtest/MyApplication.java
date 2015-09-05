package com.hangox.appconfigtest;

import android.app.Application;

import com.google.gson.Gson;
import com.hangox.appconfigtest.model.MServiceConfig;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/9/3
 * Time 下午6:26
 */
public class MyApplication extends Application {
    private MServiceConfig mMServiceConfig;
    @Override
    public void onCreate() {
        super.onCreate();
        mMServiceConfig = new Gson().fromJson(readConfig(),MServiceConfig.class);
    }

    public MServiceConfig getMServiceConfig() {
        return mMServiceConfig;
    }

    private String readConfig(){
        String config = "";
        try {
            InputStream inputStream = getResources().getAssets().open("config_service.json");
            byte[] buffer = new byte[2048];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = 0 ;
            while ((length = inputStream.read(buffer)) != -1){
                byteArrayOutputStream.write(buffer,0,length);
            }
            config = byteArrayOutputStream.toString();
            inputStream.close();
            byteArrayOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return config;
    }
}
