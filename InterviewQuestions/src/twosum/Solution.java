package twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = numsMap.get(nums[i]);
            if (complementIndex != null){
                return new int[] {i, complementIndex};
            }
            numsMap.put(target - nums[i], i);
        }

        return new int[0];
    }
}
