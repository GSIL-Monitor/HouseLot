package com.github.zhuozi.houselot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HouseLotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseLotApplication.class, args);
	}
}
