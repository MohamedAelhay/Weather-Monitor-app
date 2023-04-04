package com.example.monitorapp.controller;

import com.example.monitorapp.dto.response.WeatherDto;
import com.example.monitorapp.facade.WeatherFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(WeatherController.WEATHER_ROOT_PATH)
public class WeatherController {

    @Autowired
    private WeatherFacade weatherFacade;

    public static final String WEATHER_ROOT_PATH = "/weather";

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<WeatherDto> getAllWeatherData() {

        return weatherFacade.findAll();
    }
}
