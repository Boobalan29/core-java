package com.API.controller.Apicontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class ApicontrollerApplication {

   @GetMapping()
   String message1()
   {
	   return "Get the details";
   }
   
   
   @PostMapping()
   
   String message2()
   {
	   return "post details";
   }

   @PutMapping()
   
   String message3()
   {
	   return "update the details";
   }
   
   @DeleteMapping()
   
   String message4()
   {
	   return "delete the details";
   }
   
   @PatchMapping()
   String message5()
   
   {
	   return "Patch working";
   }
}
