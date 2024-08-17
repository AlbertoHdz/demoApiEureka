package com.docker.netflix.dockerspringnetflix_ZuulService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DockerspringnetflixZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringnetflixZuulServiceApplication.class, args);
	}

}
