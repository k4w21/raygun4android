package com.raygun.raygun4android.network;

public class RaygunNetworkRequestInfo {
    public String url;
    public Long startTime;

    public RaygunNetworkRequestInfo(String url, Long startTime) {
        this.url = url;
        this.startTime = startTime;
    }
}
