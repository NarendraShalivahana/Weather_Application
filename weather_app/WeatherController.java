package com.example.weather_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index() {
        return "weather";
    }
    @GetMapping("/weather")
    public String weather(Model model) {
        // Add logic to populate model attributes if needed
        return "weather";
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        Weather weather = weatherService.getWeather(city);
        model.addAttribute("weather", weather);
        return "weather";
    }
}
