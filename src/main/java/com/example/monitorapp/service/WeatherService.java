package com.example.monitorapp.service;

import com.example.monitorapp.entity.WeatherEntity;

import java.util.List;

public interface WeatherService {
    void create(WeatherEntity weather);

    List<WeatherEntity> findAll();
}
