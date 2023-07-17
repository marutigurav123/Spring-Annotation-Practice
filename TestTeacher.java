package com.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTeacher {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Teacher t=(Teacher) ac.getBean("myteacher");
		t.teacherInfo();
	}

}
