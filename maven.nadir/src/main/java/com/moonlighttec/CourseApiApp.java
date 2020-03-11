package com.moonlighttec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Sagt Springboot, dass das eine Springboot Applikation ist
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args); // Um die Applikation zu starten
	}

}
