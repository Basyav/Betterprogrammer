package com.betterprogrammer.palindrome;

public class BetterProgrammerTask {

	public static boolean isPalindrome(String s) {
		 /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length/2; i++) {
			if (chars[i] != chars[chars.length-i-1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("abcyxcba"));
	}
}
	
	
	
		
