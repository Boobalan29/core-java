package com.Boobalan.st.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("SuperMario")


public class SuperMario implements GamingConsole {

	public void kick()
	{
		System.out.println("superMario is kicking");
	}
	
	public void jump()
	{
		System.out.println("SuperMario is jumping");
	}
}
