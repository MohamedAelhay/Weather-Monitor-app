package com.example.monitorapp.facade;

import com.example.monitorapp.dto.response.WeatherDto;
import com.example.monitorapp.model.Weather;

import java.util.List;

public interface WeatherFacade {
    void createWeather(Weather weather);

    List<WeatherDto> findAll();
}
