package com.example.monitorapp.service.impl;

import com.example.monitorapp.entity.WeatherEntity;
import com.example.monitorapp.repository.WeatherRepository;
import com.example.monitorapp.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    @Override
    public void create(final WeatherEntity weather) {
        weatherRepository.save(weather);
    }

    @Override
    public List<WeatherEntity> findAll() {

        return weatherRepository.findAll();
    }
}
