package com.LooselyCouple.Hotel;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component
public class Controller {
	
		
@Autowired
@Qualifier("vinoth")
	Dosa menu;
	
	Controller(Dosa menu)
	{
		this.menu=menu;
	}
	
	void order()
	
	{
		menu.MasalDosa();
		menu.RavaDosa();
	}
}

