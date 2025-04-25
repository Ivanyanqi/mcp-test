package com.demo.mcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created on 2025/4/25
 *
 * @author yanqi
 * @version 1.0
 */

@SpringBootApplication
public class McpServerApp {

    private static final Logger logger = LoggerFactory.getLogger(McpServerApp.class);

    public static void main(String[] args) {
        SpringApplication.run(McpServerApp.class, args);
    }

    @Bean
    public ToolCallbackProvider weatherTools(WeatherService weatherService) {
        return MethodToolCallbackProvider.builder().toolObjects(weatherService).build();
    }
}