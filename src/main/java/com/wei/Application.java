package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
		
	}

}
