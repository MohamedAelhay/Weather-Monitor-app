package com.example.monitorapp.entity;

import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= WeatherEntity.TABLE_NAME)
public class WeatherEntity {

    public static final String TABLE_NAME = "weather";

    public static final String LOCATION = "location";

    public static final String LAT = "lat";

    public static final String LNG = "lng";

    public static final String DEGREE = "degree";

    public static final String TIME = "time";

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = LOCATION)
    private String location;

    @Column(name = LAT)
    private Double lat;

    @Column(name = LNG)
    private Double lng;

    @Column(name = DEGREE)
    private int degree;

    @Column(name = TIME)
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime time;
}
