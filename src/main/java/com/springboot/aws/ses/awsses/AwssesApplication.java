package com.springboot.aws.ses.awsses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.springboot.aws.ses")
@SpringBootApplication
public class AwssesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwssesApplication.class, args);
	}

}
