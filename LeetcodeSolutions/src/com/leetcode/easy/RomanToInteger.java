package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	/* 
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000 */
	
	
	// Attempt 1	5ms
	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		// Map Roman symbols to numbers
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int value = map.get(s.charAt(i));
			
			if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
				total -= value;
			} else {
				total += value;
			}
		}
		
		return total;
	}
}
