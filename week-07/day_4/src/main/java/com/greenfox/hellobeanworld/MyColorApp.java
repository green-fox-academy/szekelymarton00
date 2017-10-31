package com.greenfox.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyColorApp implements CommandLineRunner {

  @Autowired
  MyColor nextColor;
  public static void main(String[] args) {
    SpringApplication.run(MyColorApp.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    nextColor.printColor();
  }

}
