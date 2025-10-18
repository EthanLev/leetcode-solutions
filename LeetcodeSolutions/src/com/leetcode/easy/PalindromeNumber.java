package com.leetcode.easy;

public class PalindromeNumber {
	// Attempt 1	
//	public boolean isPalindrome(int x) {
//		if (x < 0) return false;
//		
//		String s = Integer.toString(x);
//		String reversed = new StringBuilder(s).reverse().toString();
//		
//		return s.equals(reversed);
//	}
	
	// Attempt 2	5ms
	public boolean isPalindrome(int x) {
		// Negative  or numbers ending in 0 can't be palindromes
		if (x < 0 || x % 10 == 0 && x != 0) {
			return false;
		}
		
		int reversedHalf = 0;
		while(x > reversedHalf) {
			int digit = x % 10;
			reversedHalf = reversedHalf * 10 + digit;
			x /= 10;
		}
		
		// If even digits → x == reversedHalf
        // If odd digits → ignore middle digit with reversedHalf / 10
        return (x == reversedHalf || x == reversedHalf / 10);
	}
}
