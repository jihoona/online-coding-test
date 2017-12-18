package leetcode.problem.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/*
    *   1. Two Sum
    *
    *   Input: Given nums = [2, 7, 11, 15], target = 9
    *   Process: Return indices of the two numbers such that they add up to a specific target.
    *   Output: [0, 1]
    *
    *   Requirement:
    *
    *   Personal review:
    */


    // Brute Force. Time complexity: O(n^2), Space complexity: O(1).
    public int[] twoSum(int[] nums, int target) {
        int[] selectedNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    selectedNums[0] = i;
                    selectedNums[1] = j;
                }
            }
        }
        return selectedNums;
    }

    // One-pass Hash Table. Time complexity: O(n), Space complexity: O(n).
    public int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Wrong!");
    }
}
