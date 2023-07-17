package com.spring;

import org.springframework.stereotype.Component;

@Component(value="tiger")
public class Tiger extends Animal{

	@Override
	void sond() {
		System.out.println("Roar");
		
	}
	
	
	

}
