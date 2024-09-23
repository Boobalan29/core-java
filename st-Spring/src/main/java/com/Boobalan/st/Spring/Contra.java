package com.Boobalan.st.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("Contra")
@Primary

public class Contra implements GamingConsole {
	
	public void jump()
	{
		System.out.println("Contra is jumping");
	}
	
	public void kick()
	{
		System.out.println("Contra is kicking");
	}

}
