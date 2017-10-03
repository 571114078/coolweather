package com.example.fxp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fxp on 2017/10/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
