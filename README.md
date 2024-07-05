# Weather_Application
Sure, here's a shorter version of the README file for the Weather Spring Boot application:

---

# Weather Spring Boot Application

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

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/weather-spring-boot.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Weather_Appplication
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

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
