package com.LooselyCouple.Hotel;

import org.springframework.stereotype.Component;

@Component("prasad")

public class Prasad implements Dosa {
	
	public void MasalDosa()
	{
		System.out.println("Prasad want MasalDosa");
	}

	 public void RavaDosa()
	 {
		 System.out.println("Prasad want RavaDOsa");
	 }
}
