package org.javaexercises.eurekaserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverappApplication.class, args);
	}

}
