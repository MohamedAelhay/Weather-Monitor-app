package com.example.monitorapp.model;

import lombok.Data;

@Data
public class Weather {

    private Long id;

    private String location;

    private Coordinate coordinate;

    private String time;

    private int degree;
}
