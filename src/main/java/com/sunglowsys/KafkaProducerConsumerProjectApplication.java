package com.sunglowsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerConsumerProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaProducerConsumerProjectApplication.class, args);
		System.out.println("successfully");
	}


}
