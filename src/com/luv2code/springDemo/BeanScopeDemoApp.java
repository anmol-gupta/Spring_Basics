package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		Coach newTrackCoach = context.getBean("myTrackCoach", Coach.class);
		boolean result = (trackCoach==newTrackCoach);
		System.out.println(result); // will return true if scope is singleton otherwise false if the scope is prototype
	}

}
