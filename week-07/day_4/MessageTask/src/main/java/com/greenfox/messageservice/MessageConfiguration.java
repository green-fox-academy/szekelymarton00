package com.greenfox.messageservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  MessageService messageService(){
    return new EmailService();
  }

  @Bean
  MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }
}
