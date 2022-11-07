package easy.searchinsertposition;

public class Solution {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // expected: 2
        System.out.println(searchInsert(nums, 2)); // expected: 1
        System.out.println(searchInsert(nums, 7)); // expected: 4

    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        int len = nums.length;
        int left = 0;
        int right = len - 1;

        if (target > nums[len - 1]) {
            return len;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }

        }

        return left;
    }
}
