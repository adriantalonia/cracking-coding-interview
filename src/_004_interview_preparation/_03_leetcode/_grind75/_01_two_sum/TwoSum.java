package _004_interview_preparation._03_leetcode._grind75._01_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSumForSolution(nums1, target1);
        int[] result2 = twoSumMapSolution(nums1, target1);
        System.out.println("Example 1: " + Arrays.toString(result1));
        System.out.println("Example 2: " + Arrays.toString(result2));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result3 = twoSumForSolution(nums2, target2);
        int[] result4 = twoSumMapSolution(nums2, target2);
        System.out.println("Example 3: " + Arrays.toString(result3));
        System.out.println("Example 4: " + Arrays.toString(result4));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result5 = twoSumForSolution(nums3, target3);
        int[] result6 = twoSumMapSolution(nums3, target3);
        System.out.println("Example 5: " + Arrays.toString(result5));
        System.out.println("Example 6: " + Arrays.toString(result6));

    }


    /**
     * The time complexity of the provided twoSumForSolution function is O(n^2), where n is the length of the input
     * array nums. This is because the function uses nested loops to check all pairs of elements in the array,
     * resulting in a quadratic time complexity.
     * <p>
     * Here's the breakdown:
     * <p>
     * 1) The outer loop (for (int i = 0; i < n - 1; i++)) iterates from the first element to the second-to-last element, so it runs n - 1 times.<br/>
     * 2) The inner loop (for (int j = i + 1; j < n; j++)) iterates from the next element to the last element, so it runs n - i - 1 times for each i.<br/>
     * 3) The total number of iterations is the sum of (n - 1) + (n - 2) + ... + 1, which is proportional to n^2. Therefore, the time complexity is O(n^2).<br/>
     * <p>
     * The space complexity of the function is O(1) because it uses a constant amount of additional space regardless of the size of the input array.
     **/
    public static int[] twoSumForSolution(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumMapSolution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
