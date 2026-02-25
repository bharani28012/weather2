package com.example.weather.Service;

import com.example.weather.Model.Weather;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public static List<Weather> parse(String filePath) throws Exception {

        List<Weather> weatherList = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(filePath));
        String[] line;

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        reader.readNext(); // Skip header

        while ((line = reader.readNext()) != null) {

            LocalDateTime dateTime = LocalDateTime.parse(line[0], formatter);
            double temperature = Double.parseDouble(line[1]);
            double humidity = Double.parseDouble(line[2]);
            double pressure = Double.parseDouble(line[3]);
            double heatIndex = Double.parseDouble(line[4]);

            Weather weather = new Weather(dateTime, temperature,
                    humidity, pressure, heatIndex);

            weatherList.add(weather);
        }

        reader.close();
        return weatherList;
    }
}
