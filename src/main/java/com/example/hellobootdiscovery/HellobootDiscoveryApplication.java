package com.example.hellobootdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HellobootDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellobootDiscoveryApplication.class, args);
	}
	
	@Configuration
	  public class MyConfig {

	    @Bean
	    @LoadBalanced
	    public RestTemplate restTemplate() {
	      return new RestTemplate();
	    }
	  }

}