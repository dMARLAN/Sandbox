package easy.removeelement;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }

}
