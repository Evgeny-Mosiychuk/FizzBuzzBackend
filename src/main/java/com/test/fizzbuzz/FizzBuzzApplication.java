package com.test.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FizzBuzzApplication {

  private static final Logger logger = LoggerFactory.getLogger(FizzBuzzApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(FizzBuzzApplication.class, args);
    logger.info("Application started");
  }

}
