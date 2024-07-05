package com.example.weather_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherApiClient weatherApiClient;

    public Weather getWeather(String city) {
        return weatherApiClient.fetchWeatherData(city);
    }
}

