package com.leetcode.hard;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0; // pointer for nums1
        int j = 0; // pointer for nums2
        int k = 0; // pointer for merged
        
        // Merge the two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        // Add remaining elements from nums1 (if any)
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        
        // Add remaining elements from nums2 (if any)
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        
        // Find the median
        int total = merged.length;
        if (total % 2 == 1) { // odd length
            return merged[total / 2]; // integer division gives middle index
        } else { // even length
            int mid1 = merged[(total / 2) - 1];
            int mid2 = merged[total / 2];
            return (mid1 + mid2) / 2.0; // average, use float for decimal
        }
    }
}
