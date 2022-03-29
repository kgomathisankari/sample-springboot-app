package com.example.samplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootAppApplication.class, args);
		System.out.println("Sample Message");
	}
}
