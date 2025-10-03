package com.cfs.WeatherApp.service;

import com.cfs.WeatherApp.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class Weatherservice {
    @Value("${weather.api.key}")
    private String apikey;

    @Value("${weather.api.url}")
    private String apiUrl;



    @Value("${weather.api.forecast.url}")
    private String apiforecastUrl;

    public String Test(){
        return "Good";
    }

    private RestTemplate template=new RestTemplate();
    public WeatherResponse getData(String city)
    {
        String url=apiUrl+"?Key="+apikey+"&q="+city;
        Root forObject = template.getForObject(url, Root.class);
        WeatherResponse weatherResponse=new WeatherResponse();
        String city1=forObject.getLocation().name;
        String region=forObject.getLocation().region;
        String country=forObject.getLocation().country;

        weatherResponse.setCity(forObject.getLocation().name);
        weatherResponse.setRegion(forObject.getLocation().region);
        weatherResponse.setCountry(forObject.getLocation().country);
        String condition = forObject.getCurrent().getCondition().getText();
        weatherResponse.setCondition(condition);
        weatherResponse.setTemperature(forObject.getCurrent().getTemp_c());

        return weatherResponse;
    }

    public WeatherForecast getForecast(String city, int days){
        WeatherForecast weatherForecast=new WeatherForecast();
        WeatherResponse weatherresponse = getData(city);
     WeatherForecast response=new WeatherForecast();

       response.setWeatherResponse(weatherresponse);
       List<DayTemp> daylist=new ArrayList<>();
        String url=apiforecastUrl+"?Key="+apikey+"&q="+city+"&days="+days;
        Root apirespnse = template.getForObject(url, Root.class);
        Forecast forecast = apirespnse.getForecast();
        ArrayList<Forecastday> forecastdays=forecast.getForecastday();

        for (Forecastday rs:forecastdays){
                DayTemp d=new DayTemp();
                d.setDate(rs.getDate());
                d.setMinTemp(rs.getDay().mintemp_c);
                d.setAvgTemp(rs.getDay().avgtemp_c);
                d.setMaxTemp(rs.getDay().maxtemp_c);
                daylist.add(d);

        }
            response.setDayTemp(daylist);
            return response;
    }


}
