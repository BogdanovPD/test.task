package org.murano.software.test.task;

import org.murano.software.test.task.config.DataInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean(initMethod = "init")
	public DataInitializer initTestData() {
		return new DataInitializer();
	}
}
