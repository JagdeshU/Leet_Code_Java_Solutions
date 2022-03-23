package io.jagdesh.leetcode.first_set;

import java.util.HashMap;
import java.util.stream.IntStream;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] src = {2, 7, 11, 15};
        int[] ans = new TwoSum().twoSum(src, 9);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num2Idx = new HashMap<>();
        int[] result = new int[2];

        IntStream
                .range(0, nums.length)
                .forEach(i -> {
                    if(num2Idx.containsKey(nums[i])) {
                        result[0] = num2Idx.get(nums[i]);
                        result[1] = i;
                    }
                    num2Idx.put(target - nums[i], i);
                });
        return result;
    }
}
