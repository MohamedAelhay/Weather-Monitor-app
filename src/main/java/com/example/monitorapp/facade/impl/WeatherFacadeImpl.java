package com.example.monitorapp.facade.impl;

import com.example.monitorapp.converter.WeatherDtoConverter;
import com.example.monitorapp.converter.WeatherEntityConverter;
import com.example.monitorapp.dto.response.WeatherDto;
import com.example.monitorapp.entity.WeatherEntity;
import com.example.monitorapp.facade.WeatherFacade;
import com.example.monitorapp.model.Weather;
import com.example.monitorapp.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class WeatherFacadeImpl implements WeatherFacade {

    private final WeatherService weatherService;

    private final WeatherDtoConverter weatherDtoConverter;

    private final WeatherEntityConverter weatherEntityConverter;

    @Override
    public void createWeather(final Weather weather) {

        final WeatherEntity weatherEntity = weatherEntityConverter.convert(weather);

        weatherService.create(weatherEntity);
    }

    @Override
    public List<WeatherDto> findAll() {

        return weatherService
                .findAll()
                .stream()
                .map(weatherDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
