package com.config;

import com.service.CopyrightGenService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterCopyrightProperties.class)
public class StarterCopyrightConfiguration {

    @Bean
    public CopyrightGenService genService(StarterCopyrightProperties props) {
        return new CopyrightGenService(props);
    }

}
