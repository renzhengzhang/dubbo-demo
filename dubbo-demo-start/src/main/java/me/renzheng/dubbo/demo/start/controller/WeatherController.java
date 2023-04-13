package me.renzheng.dubbo.demo.start.controller;

import com.example.dubbo.demo.model.WeatherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * WeatherController
 *
 * @author Renzheng
 * @since 2023/4/13
 */
@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/next-week")
    public List<WeatherDTO> getNextWeekWeather() {
        throw new UnsupportedOperationException();
    }
}
