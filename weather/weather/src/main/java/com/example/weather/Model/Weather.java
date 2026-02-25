package com.example.weather.Model;

import java.time.LocalDateTime;

public class Weather {
    private LocalDateTime dateTime;
    private double temperature;
    private double humidity;
    private double pressure;
    private double heatIndex;

    // Constructor
    public Weather(LocalDateTime dateTime, double temperature, double humidity, double pressure, double heatIndex) {
        this.dateTime = dateTime;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = heatIndex;
    }

    // Getters
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHeatIndex() {
        return heatIndex;
    }
}