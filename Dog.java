package com.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component(value="dog")
  class Dog extends Animal{
	  
	  

	@Override
	void sond() {
		System.out.println("BArk");
		
	}

	
	

}
