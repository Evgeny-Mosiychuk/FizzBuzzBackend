package com.test.fizzbuzz.config;

import java.util.Map;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "fizz-buzz")
@Data
public class ValueConfig {
  private Map<Integer, String> mapping;
}
