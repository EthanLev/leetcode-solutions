package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	// 
//	public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{}; // No solution found
//    }
	
	// 2ms
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			
			if (complementIndex != null) {
				return new int[] {i, complementIndex};
			}
			
			complements.put(target - nums[i], i);
		}
		
		return nums;
	}
}
