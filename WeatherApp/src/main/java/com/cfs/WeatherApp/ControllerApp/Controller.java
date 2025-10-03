package com.cfs.WeatherApp.ControllerApp;

import com.cfs.WeatherApp.dto.WeatherForecast;
import com.cfs.WeatherApp.dto.WeatherResponse;
import com.cfs.WeatherApp.service.Weatherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class Controller {

    @Autowired
    private Weatherservice weatherservice;


    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city){
        return weatherservice.Test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        return weatherservice.getData(city);

    }

    @GetMapping("/forecast")
    public WeatherForecast getForcast(@RequestParam String city, @RequestParam int days){
        return weatherservice.getForecast(city, days);

    }
}
