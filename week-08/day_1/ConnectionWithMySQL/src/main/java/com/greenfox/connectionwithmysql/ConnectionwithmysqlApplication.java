package com.greenfox.connectionwithmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@EnableWebMvc
@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionwithmysqlApplication.class, args);
	}


	@Autowired
	TodoRepo repo;

	@Autowired
  AssigneeRep aRepo;

	@Override
	public void run(String... args) throws Exception {

		repo.save(new Todo("First on the list"));
		aRepo.save((new Assignee("Marci","marci@gmail.com")));


	}
}
