package com.employeeproject.springbootfirstapp;

import com.employeeproject.springbootfirstapp.dependancyinjection.myWebController;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class employeeFirstAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(employeeFirstAppApplication.class, args);
		myWebController controller = context.getBean(myWebController.class);
		System.out.println(controller.valueFromBusiness());
	}

}
