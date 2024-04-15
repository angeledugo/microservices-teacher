package com.microservises.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservisesTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservisesTeacherApplication.class, args);
	}

}
