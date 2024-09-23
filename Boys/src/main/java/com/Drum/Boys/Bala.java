package com.Drum.Boys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Bala {
	
	
	@GetMapping()
	String message1()
	{
		return "Lenet";
	}
	
	@PutMapping()
	String One1()
	{
		return "Tamil";
		
	}

	@PostMapping()
	String Two2()
	{
		return "Bala";
	}
	
	
	@GetMapping()
	String message13()
	{
		return "Lenet1";
	}
	
	@PutMapping()
	String One()
	{
		return "Tamil1";
		
	}

	@PostMapping()
	String Two()
	{
		return "Bala1";
	}
	
}



		

