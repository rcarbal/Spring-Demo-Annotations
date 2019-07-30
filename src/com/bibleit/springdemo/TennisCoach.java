package com.bibleit.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	// Define the default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default construcot");
	}
	
	/*
	@Autowired
	public void dosomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSOmeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your swing";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
