package _004_interview_preparation._03_leetcode._grind75._08_binary_search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums2 = {1, 0, 3, 5, 9, 12};
        System.out.println("input = [-1,0,3,5,9,12], target = 9, result: " + search(nums, 9));
        System.out.println("input = [-1,0,3,5,9,12], target = 2, result: " + search(nums2, 2));
    }

    public static int search(int[] nums, int target) {
        int init = 0;
        int last = nums.length - 1;

        return search(nums, target, init, last);
    }

    public static int search(int[] nums, int target, int init, int last) {
        if (init > last) {
            return -1;
        } else {
            int mid = init + (last - init) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) return search(nums, target, mid + 1, last);
            else return search(nums, target, init, mid - 1);
        }
    }
}
