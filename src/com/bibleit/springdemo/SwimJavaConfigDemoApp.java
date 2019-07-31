package com.bibleit.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout() );
		
		// Get method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
