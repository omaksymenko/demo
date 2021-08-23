package com.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit")
@Data
public class LimitConfiguration {
    private int min;
    private int max;
}
