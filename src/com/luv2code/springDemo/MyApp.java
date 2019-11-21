package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("****************");
		Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
		System.out.println(theTrackCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyFortune());
		System.out.println("------------------");
		CricketCoach theCricketCoach = (CricketCoach) context.getBean("myCricketCoach", Coach.class);
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println(theCricketCoach.getEmail());
		System.out.println(theCricketCoach.getTeam());
		context.close();
	}

}
