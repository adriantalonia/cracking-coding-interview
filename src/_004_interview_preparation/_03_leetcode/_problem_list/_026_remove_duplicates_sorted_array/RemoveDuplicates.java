package _004_interview_preparation._03_leetcode._problem_list._026_remove_duplicates_sorted_array;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("Output: " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i]+" ");
        }
        System.out.println();
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("Output: " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int init = 0;
        int last = 1;

        while (last < nums.length) {
            if (nums[last] != nums[init]) {
                init++;
                nums[init] = nums[last];
            }
            last++;
        }
        return init + 1;
    }

}
