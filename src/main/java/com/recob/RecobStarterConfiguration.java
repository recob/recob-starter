package com.recob;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class RecobStarterConfiguration {

    @Bean
    @Profile("!dev")
    public RegisterApplicationListener registerApplicationListener() {
        return new RegisterApplicationListener();
    }
}
