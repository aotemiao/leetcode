package com.leetcode.two_sum;

import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Hashtable<Integer, Integer> hashtable = new Hashtable<>(length - 1);
        hashtable.put(nums[0], 0);
        for (int i = 1; i < length; i++) {
            int anotherNum = target - nums[i];
            if (hashtable.containsKey(anotherNum)) {
                return new int[]{hashtable.get(anotherNum), i};
            }
            hashtable.put(nums[i], i);
        }
        throw new IllegalArgumentException("error");
    }
}