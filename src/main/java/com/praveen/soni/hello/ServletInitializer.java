package com.praveen.soni.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PraveenHelloWorldApplication.class);
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(PraveenHelloWorldApplication.class, args);
    }

}
