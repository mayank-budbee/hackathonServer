package com.example.hackathonserver;


public class AnimResponse {
     private String name = "";
     private String address = "";
     private Integer exits = 4212;
     private Double[] coordinates;

    public AnimResponse(String name, String address, Integer exits, Double[] coordinates) {
        this.name = name;
        this.address = address;
        this.exits = exits;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getExits() {
        return exits;
    }

    public void setExits(Integer exits) {
        this.exits = exits;
    }

    public Double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }
}
