package com.hangox.appconfigtest.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/9/3
 * Time 下午6:50
 */
public class MServiceConfig {

    @SerializedName("host")
    private String mHost;
    @SerializedName("port")
    private String mPort;


    public String getHost() {
        return mHost;
    }

    public void setHost(String host) {
        mHost = host;
    }

    public String getPort() {
        return mPort;
    }

    public void setPort(String port) {
        mPort = port;
    }
}
