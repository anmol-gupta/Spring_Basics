package com.luv2code.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hey!!!" + fortuneService.getFortune();
	}
	// init-method
	public void doMyStartupStuff() {
		System.out.println("I am a sysout from init-method");
	}
	
	//destroy-method
	public void doMyCleanupStuff() {
		System.out.println("I am a sysout from destroy method");
	}

}
