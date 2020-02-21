package com.jeent.example.schedulingtasksmaven;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	/*
	 * 5초
	 */
	@Scheduled(fixedRate = 5000)
	public void printNowDateTime() {
		System.out.println(LocalDateTime.now().toString());
	}
	
}
