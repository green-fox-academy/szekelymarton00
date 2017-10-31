package com.greenfox.greenfoxclub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxMaker {

  @Bean
  public Fox fox() {
    return new Fox();
  }
}
