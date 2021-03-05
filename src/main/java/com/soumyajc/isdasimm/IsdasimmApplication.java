package com.soumyajc.isdasimm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsdasimmApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(IsdasimmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IsdasimmApplication.class, args);
		LOGGER.info("Successfully finished the Application");
	}

}
