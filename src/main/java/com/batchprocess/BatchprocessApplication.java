package com.batchprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.batchprocess")
@SpringBootApplication
@EnableAutoConfiguration
public class BatchprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchprocessApplication.class, args);
	}

}
