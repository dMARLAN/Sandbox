package easy.removeduplicatesfromsortedarray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length <= 1) {
            return nums.length;
        }

        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
