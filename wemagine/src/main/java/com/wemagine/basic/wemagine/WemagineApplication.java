package com.wemagine.basic.wemagine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class WemagineApplication {

	public static void main(String[] args) {
		SpringApplication.run(WemagineApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue = "World") String name)
	{
		return String.format("Hello %s", name);
	}
	
	
}
