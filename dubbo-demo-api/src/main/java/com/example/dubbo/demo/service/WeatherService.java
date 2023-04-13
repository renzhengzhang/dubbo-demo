package com.example.dubbo.demo.service;

import com.example.dubbo.demo.model.WeatherDTO;

import java.util.List;

/**
 * WeatherService
 *
 * @author Renzheng
 * @since 2023/4/13
 */
public interface WeatherService {
    List<WeatherDTO> getNextWeekWeather();
}
