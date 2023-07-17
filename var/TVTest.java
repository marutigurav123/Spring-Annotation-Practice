package com.spring.var;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ConfigFile;

public class TVTest {

	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(ConfigFile.class);
		
		TV tv=(TV) ac.getBean("mytv");
		tv.tvInfo();

	}

}
