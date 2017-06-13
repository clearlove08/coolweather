package com.example.wang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wang on 2017/6/10.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
