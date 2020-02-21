package com.jeent.example.schedulingtasksmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksMavenApplication.class, args);
	}

}
