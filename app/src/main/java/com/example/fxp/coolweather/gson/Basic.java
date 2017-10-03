package com.example.fxp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fxp on 2017/9/30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
