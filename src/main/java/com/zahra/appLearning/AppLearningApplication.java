package com.zahra.appLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.zahra.appLearning.repository")
@EntityScan("com.zahra.appLearning.entity") // To-ask if optional
public class AppLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLearningApplication.class, args);
	}

}
