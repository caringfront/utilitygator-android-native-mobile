package com.safeaide.safeaide;

import com.google.gson.annotations.SerializedName;

public class Post {

    private double lat;
    private double lon;
    private String deviceId;

    public Post(double lat, double lon, String deviceId) {
        this.lat = lat;
        this.lon = lon;
        this.deviceId = deviceId;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
