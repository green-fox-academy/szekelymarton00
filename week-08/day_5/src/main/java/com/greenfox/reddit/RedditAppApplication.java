package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RedditAppApplication.class, args);
	}


	@Autowired
	PostsRepo post;

	@Override
	public void run(String... args) throws Exception {
		post.save(new Post("This is the first post"));

	}
}
