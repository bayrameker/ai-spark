package com.aispark.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.aispark.core.model.AIModel;

@Configuration
public class CoreConfig {

    @Bean
    public AIModel aiModel() {
        return new AIModel();
    }
}
