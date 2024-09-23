package com.LooselyCouple.Hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context=	SpringApplication.run(HotelApplication.class, args);
	
	Controller Ab= context.getBean(Controller.class);
	Ab.order();
		
		
//		Vinoth ab=new Vinoth();
//		Prasad ab1=new Prasad();
//		Controller abc=new Controller(ab1);
//		abc.order();
	
	
	
	
	
	
	
	}

}
