package com.example.hackathonserver.dao;




public class Position {
        Integer userId;
        String timestamp;
        Double lat;
        Double lon;

    public Position(Integer userId, String timestamp, Double lat, Double lon) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.lat = lat;
        this.lon = lon;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
