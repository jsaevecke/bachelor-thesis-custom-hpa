package com.julien.saevecke.learner.sul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SulApplication {
	public static void main(String[] args) {
		SpringApplication.run(SulApplication.class, args);
	}
}
