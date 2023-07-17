package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="combine")
public class Combine {
	@Autowired
	Animal animal;
	
	public void simple()
	{
		System.out.println(animal);
	}

}
