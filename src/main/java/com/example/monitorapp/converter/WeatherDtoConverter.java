package com.example.monitorapp.converter;

import com.example.monitorapp.dto.response.WeatherDto;
import com.example.monitorapp.entity.WeatherEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class WeatherDtoConverter implements Converter<WeatherEntity, WeatherDto> {

    @Override
    public WeatherDto convert(WeatherEntity source) {

        return WeatherDto.builder()
                .lat(source.getLat())
                .lng(source.getLng())
                .time(source.getTime())
                .degree(source.getDegree())
                .location(source.getLocation())
                .build();
    }
}
