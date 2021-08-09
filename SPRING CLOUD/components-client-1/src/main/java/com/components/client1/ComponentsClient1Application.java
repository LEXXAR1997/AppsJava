package com.components.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComponentsClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsClient1Application.class, args);
	}

}
