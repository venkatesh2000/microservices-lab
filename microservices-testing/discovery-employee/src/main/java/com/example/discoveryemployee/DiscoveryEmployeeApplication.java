package com.example.discoveryemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEmployeeApplication.class, args);
	}

}
