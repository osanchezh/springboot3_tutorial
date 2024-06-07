package com.buffer.deparmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeparmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeparmentServiceApplication.class, args);
	}

}
