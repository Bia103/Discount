package com.example.discount.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("adoption")
@Getter
@Setter
public class PropertiesConfig {
    private String version;
    private String center;
    private int price;
}
