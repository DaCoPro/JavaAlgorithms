
package com.dcomer.AlgoPractice;

import com.dcomer.tests.*;


public class AlgoPractice {
	
	public static void main(String[] args) {
		testGAALgos();
		testLCAlgos();
	}
	
	public static void testGAALgos () {
		GAAlgorithmChallengeTests ga_tests = new GAAlgorithmChallengeTests();
		
		int ga_fail_count = 0;
		int ga_pass_count = 0;

		if (ga_tests.testSayHello()) {
			ga_pass_count += 1;
		} else {
			ga_fail_count += 1;
		}
		if (ga_tests.testAddOne()) {
			ga_pass_count += 1;
		} else {
			ga_fail_count += 1;
		}
		if (ga_tests.testAddTwoNums()) {
			ga_pass_count += 1;
		} else {
			ga_fail_count += 1;
		}
		
		if (ga_tests.testSumNumbers()) {
			ga_pass_count += 1;
		} else {
			ga_fail_count += 1;
		}

		System.out.println("GA Set Passes: " + String.valueOf(ga_pass_count));
		System.out.println("GA Set Fails: " + String.valueOf(ga_fail_count));
	}


	public static void testLCAlgos () {
		LeetcodeTests lc_tests = new LeetcodeTests();
		
		int lc_fail_count = 0;
		int lc_pass_count = 0;
		
		if (lc_tests.testRomanToInt()) {
			lc_pass_count += 1;
		} else {
			lc_fail_count += 1;
		}
		
		System.out.println("LC Set Passes: " + String.valueOf(lc_pass_count));
		System.out.println("LC Set Fails: " + String.valueOf(lc_fail_count));
	}
}
