# Weather_Application

## Overview

This application provides real-time weather information using external APIs, built with Spring Boot.

## Features

- Real-time weather data
- Multiple weather parameters (temperature, humidity, wind speed)
- RESTful API
- User-friendly interface
- Efficient caching

## Technologies

- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- Bootstrap
- RESTful APIs
- H2 Database

## Getting Started

### Prerequisites

- Java 17+
- Maven
- Git

### Installation

### Configuration

Set your API key in `application.properties`:
```properties
weather.api.key=your_api_key_here
```

### Usage

Access the app at `http://localhost:8080`. Use the interface to search for weather information.

### API Endpoints

- **GET /weather?location={location}**: Fetch weather data.
- **GET /weather/history?location={location}**: Fetch historical data.

## License

This project is licensed under the MIT License.

---

Feel free to adjust as needed!
