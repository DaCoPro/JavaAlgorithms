
package com.dcomer.AlgoPractice;

import com.dcomer.tests.*;


public class AlgoPractice {

	public static void main(String[] args) {
		GAAlgorithmChallengeTests ga_tests = new GAAlgorithmChallengeTests();
		LeetcodeTests lc_tests = new LeetcodeTests();
		
		int ga_fail_count = 0;
		int ga_pass_count = 0;
		
		ga_tests.testSayHello();
		ga_tests.testAddOne();
		ga_tests.testAddTwoNums();
		ga_tests.testSumNumbers();
		
		
	
		int ls_fail_count = 0;
		int ls_pass_count = 0;
		
		lc_tests.testRomanToInt();
		
		
		
	}

}
