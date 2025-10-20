package com.leetcode.easy;

public class LongestCommonPrefix {
	// 0ms
	public String longestCommonPrefix(String[] str) {
		if (str.length == 0) return "";
		
		String prefix = str[0];
		
		for (int i = 1; i < str.length; i++) {
			// Keep removing last char from prefix until current word starts with it
			while (!str[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				
				if (prefix.isEmpty()) return "";
			}
		}
		
		return prefix;
	}
}
