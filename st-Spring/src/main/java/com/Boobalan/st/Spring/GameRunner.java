package com.Boobalan.st.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class GameRunner {
	//@Autowired
	@Qualifier("Contra") 
	GamingConsole gm;
	
	GameRunner(GamingConsole gm)
	{
		this.gm=gm;
	}
	
	void run()
	{
		gm.kick(); 
		
		gm.jump();
		
	}

}
