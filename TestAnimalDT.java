package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnimalDT {

	public static void main(String[] args) {
		
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(ConfigFile.class);
		Combine c=(Combine) ac.getBean("combine");
		c.simple();

	}

}
