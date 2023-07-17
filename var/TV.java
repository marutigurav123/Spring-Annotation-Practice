package com.spring.var;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="mytv")
public class TV {
	@Value(value="MI")
	private String name;
	@Value(value="23000")
	private int price;
	@Value(value="LED")
	private String type;
	
	public void tvInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("type :"+type);
		
	}
	

}
