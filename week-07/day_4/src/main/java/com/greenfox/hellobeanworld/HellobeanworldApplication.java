package com.greenfox.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.plugin2.message.Message;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  HelloWorld nextHelo;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);

  }

  @Override
  public void run(String... args) throws Exception {
    nextHelo.getMessage();
  }
}
