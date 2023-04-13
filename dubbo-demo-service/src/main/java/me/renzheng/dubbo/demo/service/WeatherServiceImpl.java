package me.renzheng.dubbo.demo.service;

import com.example.dubbo.demo.model.WeatherDTO;
import com.example.dubbo.demo.service.WeatherService;

import java.time.LocalDate;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * WeatherServiceImpl
 *
 * @author Renzheng
 * @since 2023/4/13
 */
public class WeatherServiceImpl implements WeatherService {

    private final String[] summaries = new String[]{
            "Freezing", "Bracing", "Chilly",
            "Cool", "Mild", "Warm",
            "Balmy", "Hot", "Sweltering", "Scorching"
    };

    @Override
    public List<WeatherDTO> getNextWeekWeather() {
        RandomGenerator generator = RandomGenerator.of("Xoroshiro128PlusPlus");

        return IntStream.range(0, 7).mapToObj(index -> {
            WeatherDTO weather = new WeatherDTO();
            weather.setDate(LocalDate.now().plusDays(index));
            weather.setTemperature(generator.nextDouble(-10.0, 40.0));
            weather.setSummary(summaries[generator.nextInt(0, summaries.length)]);
            return weather;
        }).collect(Collectors.toList());
    }
}
