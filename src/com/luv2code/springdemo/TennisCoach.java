package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//default bean id generated by Spring would be tennisCoach
@Component//("thatSillyCoach") Spring will automaticly register this bean, + bean id
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practise your backhand volley";
	}

}
