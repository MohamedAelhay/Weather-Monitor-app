package com.example.monitorapp.converter;

import com.example.monitorapp.entity.WeatherEntity;
import com.example.monitorapp.model.Weather;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class WeatherEntityConverter implements Converter<Weather, WeatherEntity> {

    @Override
    public WeatherEntity convert(Weather source) {
        return WeatherEntity.builder()
                .degree(source.getDegree())
                .location(source.getLocation())
                .lat(source.getCoordinate().getLat())
                .lng(source.getCoordinate().getLng())
                .time(LocalDateTime.parse(source.getTime()))
                .build();
    }
}
