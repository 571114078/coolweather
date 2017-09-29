package com.example.fxp.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by fxp on 2017/9/29.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
