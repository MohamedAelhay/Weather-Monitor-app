package com.example.monitorapp.repository;

import com.example.monitorapp.entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
}
