package com.dcomer.tests;

import com.dcomer.algorithms.GAAlgorithmChallenges;

public class GAAlgorithmChallengeTests {
	GAAlgorithmChallenges algorithms = new GAAlgorithmChallenges();
	
	public void testSayHello() {
		String result = algorithms.sayHello();
		
		if(result == "Hello!") {
			System.out.println("test 1 passed.");
		} else {
			System.out.println("test 1 failed.");
		}
	}
	
	public void testAddOne() {
		
		int result = algorithms.addOne(4);
		
		if(result == 5) {
			System.out.println("test 2 passed.");
			
		} else {
			System.out.println("test 2 failed.");
		}
	}
	
	public void testAddTwoNums() {
		int result = algorithms.addTwoNumbers(4, 6);
		
		if(result == 10) {
			System.out.println("test 3 passed.");
			
		} else {
			System.out.println("test 3 failed.");
		}
	}
	
	public void testSumNumbers() {
		int[] intArr = {10, 20, 30, 40, 50};
		
		int result_empty = algorithms.sumNumbers(new int[0]);
		int result = algorithms.sumNumbers(intArr);
	
		
		if(result_empty == 0 && result == 150) {
			System.out.println("test 4 passed.");
		} else {
			System.out.println("test 4 failed.");
		}
		
	}
	
}



