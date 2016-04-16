package com.valmaraz.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Víctor Almaraz on 16/04/2016.
 * http://www.valmaraz.com
 */
public class Coord {

    @SerializedName("lon")
    public double lon;

    @SerializedName("lat")
    public double lat;
}
