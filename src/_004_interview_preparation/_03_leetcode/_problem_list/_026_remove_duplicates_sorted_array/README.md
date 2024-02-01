# 26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be accepted.



Example 1:
```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
```
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
```
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


# Intuition
The intuition for this problem is to use two pointers (init and last) to iterate through the array and identify and store unique elements in the initial part of the array.

# Approach
The approach involves iterating through the array with two pointers:

- init: Points to the last unique element found.
- last: Iterates through the array to find new unique elements.

While iterating, if a new unique element is found (nums[last] != nums[init]),
- the init pointer is moved forward, and the new unique element is stored at the updated init position in the array.

The process continues until the last pointer reaches the end of the array. The number of unique elements is given by init + 1.

# Complexity
- Time complexity:
  O(n), where n is the length of the input array. Both pointers traverse the array once.

- Space complexity:
  O(1), as the algorithm modifies the input array in-place without using any additional space.

# Code
```java
class Solution {
    public int removeDuplicates(int[] nums) {
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
```