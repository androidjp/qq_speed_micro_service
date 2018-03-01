package com.cargosmart.service_car_0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.cargosmart.service_car_0")
@EnableEurekaClient
@EnableWebMvc
public class ServiceCar0Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCar0Application.class, args);
	}
}
