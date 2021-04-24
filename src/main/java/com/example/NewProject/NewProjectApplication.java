package com.example.NewProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NewProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NewProjectApplication.class, args);

		Customer cust = context.getBean(Customer.class);

		cust.show();

	}

}
