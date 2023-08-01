package com.shah.consuldiscoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulDiscoveryClientApplication.class, args);
	}

}
