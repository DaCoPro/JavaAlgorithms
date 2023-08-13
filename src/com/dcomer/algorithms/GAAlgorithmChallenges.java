package com.dcomer.algorithms;

public class GAAlgorithmChallenges {
	public String sayHello() {
		return "Hello!";
	};
	
	public int addOne(int number) {
		return number + 1;
	}
	public int addTwoNumbers(int number1, int number2) {
		return number1 + number2;
	}
	
	/*-----------------------------------------------------------------
	  Challenge: 03-sumNumbers
	  
	  Difficulty: Basic  
	  
	  Prompt:
	  
	  - Write a function called sumNumbers that accepts a single array of numbers and returns the sum of the numbers in the array.
	  - If the array is empty, return 0 (zero).
	  
	  Examples:
	  
	  sumNumbers([10]) //=> 10
	  sumNumbers([5, 10]) //=> 15
	  sumNumbers([2, 10, -5]) //=> 7
	  sumNumbers([]) //=> 0
	  -----------------------------------------------------------------*/
	
	public int sumNumbers(int[] numsArr) {
		int accumulator = 0;
		
		for (int i=0;i < numsArr.length; i++) {
			accumulator = numsArr[i] + accumulator;
		}
		
		return accumulator;
	}
}


