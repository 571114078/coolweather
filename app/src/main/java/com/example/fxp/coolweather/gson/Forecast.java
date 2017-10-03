package com.example.fxp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fxp on 2017/10/3.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cound")
    public More more;


    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
