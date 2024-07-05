package com.example.weather_app;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class WeatherApiClient {

    private final String API_KEY = ""; // Replace with your actual API key
    private final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather";

    public Weather fetchWeatherData(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(WEATHER_API_URL)
                .queryParam("key", API_KEY)
                .queryParam("q", city)
                .toUriString();

        WeatherApiResponse response = restTemplate.getForObject(url, WeatherApiResponse.class);

        Weather weather = new Weather();
        weather.setCity(response.getLocation().getName());
        weather.setTemperature(response.getCurrent().getTemp_c() + "°C");
        weather.setDescription(response.getCurrent().getCondition().getText());
        weather.setIconUrl("http:" + response.getCurrent().getCondition().getIcon());

        return weather;
    }

    private static class WeatherApiResponse {
        private Location location;
        private Current current;

        // Getters and Setters

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Current getCurrent() {
            return current;
        }

        public void setCurrent(Current current) {
            this.current = current;
        }

        public static class Location {
            private String name;

            // Getters and Setters

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class Current {
            private double temp_c;
            private Condition condition;

            // Getters and Setters

            public double getTemp_c() {
                return temp_c;
            }

            public void setTemp_c(double temp_c) {
                this.temp_c = temp_c;
            }

            public Condition getCondition() {
                return condition;
            }

            public void setCondition(Condition condition) {
                this.condition = condition;
            }

            public static class Condition {
                private String text;
                private String icon;

                // Getters and Setters

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }
        }
    }
}

