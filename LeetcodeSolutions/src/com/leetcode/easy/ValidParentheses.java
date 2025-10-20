package com.leetcode.easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	// 165ms
//	public boolean isValid(String s) {
//		while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
//			s = s.replace("()", "");
//			s = s.replace("{}", "");
//			s = s.replace("[]", "");
//		}
//		
//		return s.isEmpty();
//	}
	
	// 4ms
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');

        for (char c : s.toCharArray()) {
            if (pairs.containsValue(c)) {
                stack.push(c);
            } else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
