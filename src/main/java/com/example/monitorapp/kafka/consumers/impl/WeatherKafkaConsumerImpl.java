package com.example.monitorapp.kafka.consumers.impl;

import com.example.monitorapp.facade.WeatherFacade;
import com.example.monitorapp.model.Weather;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WeatherKafkaConsumerImpl {

    private final WeatherFacade weatherFacade;

    @KafkaListener(topics = "${kafka.topics.weatherTopic}", groupId = "weather")
    public void listenGroupFoo(Weather message) {

        weatherFacade.createWeather(message);
    }
}
