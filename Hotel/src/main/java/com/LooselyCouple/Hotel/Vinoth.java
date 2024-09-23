package com.LooselyCouple.Hotel;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("vinoth")
@Primary

public class Vinoth  implements Dosa{
	
	public void MasalDosa()
	{
		System.out.println("vinoth want MasalDosa");
	}

	public void RavaDosa()
	{
		System.out.println("vinoth want RavaDosa");
	}
}
