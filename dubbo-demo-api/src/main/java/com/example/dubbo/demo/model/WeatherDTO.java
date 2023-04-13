package com.example.dubbo.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * WeatherDO
 *
 * @author Renzheng
 * @since 2023/4/13
 */
@Getter
@Setter
public class WeatherDTO {
    private LocalDate date;
    private Double temperature;
    private String summary;
}
