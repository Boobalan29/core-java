 package com.Boobalan.st.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class Application {

	public static void main(String[] args ) {
		
		
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		 
		 
		GameRunner AB=context.getBean(GameRunner.class);
		
		AB.run();																							
		}
	}
