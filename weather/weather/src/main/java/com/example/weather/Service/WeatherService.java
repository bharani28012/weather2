package com.example.weather.Service;
import org.springframework.stereotype.Service;
import com.example.weather.Repository.WeatherRepository;                                            
@Service
public class WeatherService {               
    private final WeatherRepository weatherRepository;
    
    public WeatherRepository getWeatherRepository() {
        return weatherRepository;
    }
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }
    private String temperature;                                     
    private String pressure;
    private String humidity;

    public String getTemperature(String path) {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getPressure() {
        return pressure;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}                                                                           
