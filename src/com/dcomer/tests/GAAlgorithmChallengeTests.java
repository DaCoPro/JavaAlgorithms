package com.dcomer.tests;

import com.dcomer.algorithms.GAAlgorithmChallenges;

public class GAAlgorithmChallengeTests {
	GAAlgorithmChallenges algorithms = new GAAlgorithmChallenges();
	
	public boolean testSayHello() {
		String result = algorithms.sayHello();
		

		if(result == "Hello!") {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testAddOne() {
		
		int result = algorithms.addOne(4);
		
		if(result == 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testAddTwoNums() {
		int result = algorithms.addTwoNumbers(4, 6);
		
		if(result == 10) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean testSumNumbers() {
		int[] intArr = {10, 20, 30, 40, 50};
		
		int result_empty = algorithms.sumNumbers(new int[0]);
		int result = algorithms.sumNumbers(intArr);
	
		
		if(result_empty == 0 && result == 150) {
			return true;
		} else {
			return false;
		}
		
	}
	
}



