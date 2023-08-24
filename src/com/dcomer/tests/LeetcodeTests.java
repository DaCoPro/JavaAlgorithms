package com.dcomer.tests;

import com.dcomer.algorithms.LeetcodeAlgos;

public class LeetcodeTests {
	LeetcodeAlgos algorithms = new LeetcodeAlgos();
	
	public boolean testRomanToInt() {
		int five_result = algorithms.romanToInt("V");
		
		
		
		if (five_result == 5) {
			return true;
		} else {
			return false;
		}
	}
}
