package com.example.shawweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yourzeromax on 2017/5/14.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;


    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public  String info;
    }
}