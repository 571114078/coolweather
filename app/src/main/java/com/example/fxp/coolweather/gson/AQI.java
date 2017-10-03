package com.example.fxp.coolweather.gson;

/**
 * Created by fxp on 2017/9/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
