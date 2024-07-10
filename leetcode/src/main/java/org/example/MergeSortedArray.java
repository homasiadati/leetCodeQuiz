package org.example;

import java.util.Arrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            for (int j = 0; j < n; j++) {
                nums1[i] = nums2[j];
            }
        }

        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    nums1[i] = nums1[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
