package com.components.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComponentsClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsClient2Application.class, args);
	}

}
