package com.demo.mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

/**
 * Created on 2025/4/25
 *
 * @author yanqi
 * @version 1.0
 */
@Service
public class WeatherService {


    @Tool(description = "根据城市查询天气")
    public String getWeather(String cityName) {
        System.out.println("Get weather information by city name");
        return "It's sunny";
    }
}
