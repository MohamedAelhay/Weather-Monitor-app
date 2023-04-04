package com.example.monitorapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {

    private String location;

    private Double lat;

    private Double lng;

    private LocalDateTime time;

    private int degree;
}
