package org.brinkerhoff.sandbox.propertysandbox.config;

import org.brinkerhoff.sandbox.propertysandbox.models.StateModel;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfig {

    @Bean
    @ConfigurationProperties(prefix="states")
    public List<StateModel> states(){
        return new ArrayList<>();
    }
}
