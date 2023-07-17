package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myteacher")
public class Teacher {
	@Autowired
	private Address address;
	
	public void teacherInfo()
	{
		System.out.println("Teacher Info");
		address.Data();
	}

}
