package com.dcomer.tests;

import com.dcomer.algorithms.GAAlgorithmChallenges;

public class GAAlgorithmChallengeTests {
	
	public void testSayHello() {
		GAAlgorithmChallenges algorithms = new GAAlgorithmChallenges();
		String result = algorithms.sayHello();
		
		if(result == "Hello!") {
			System.out.println("test 1 passed.");
		} else {
			System.out.println("test 1 failed.");
		}
		
	}
}
