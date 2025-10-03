package com.cfs.WeatherApp.dto;
//DTO-Data Response Object
public class WeatherResponse {
    private String city;
    private String region;
    private String Country;

    private String Condition;
    private double temperature;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public WeatherResponse() {
    }

    public WeatherResponse(String city, String region, String country, String condition, double temperature) {
        this.city = city;
        this.region = region;
        Country = country;
        Condition = condition;
        this.temperature = temperature;
    }
}