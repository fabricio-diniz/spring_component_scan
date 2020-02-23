package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.demo.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.demo.service", "com.spring.demo.controller"})
public class SpringAulasApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringAulasApplication.class, args);
		
		MyController controller = (MyController) appContext.getBean("myController");
		
		controller.helloWord();
	}

}
