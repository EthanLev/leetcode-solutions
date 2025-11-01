package com.leetcode.medium;

import java.util.*;

class Solution {
	// 6 ms
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        // Move the right pointer step by step
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If current char is already in the window, shrink from the left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the new char and update result
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
