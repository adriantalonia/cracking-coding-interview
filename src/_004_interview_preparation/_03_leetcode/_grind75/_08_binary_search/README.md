# Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.


# Intuition
The problem involves searching for a target value in a sorted array using binary search. The key intuition behind binary search is repeatedly dividing the search space in half until the target is found or the search space is empty.

# Approach
The approach is to perform a binary search on the given sorted array. The algorithm starts with an initial search space defined by the indices init and last. It calculates the middle index (mid) and compares the target value with the element at the middle index. Depending on the comparison, the search space is updated by narrowing it down to the left or right half. This process is repeated until the target is found or the search space becomes empty.

# Complexity
- Time complexity: O(logn)
  The time complexity is logarithmic because at each step, the search space is divided in half.

- Space complexity: O(logn) (recursive stack space)
  The space complexity is determined by the depth of the recursion stack. In the worst case, the recursion depth is logarithmic, corresponding to the height of the binary search tree.

# Code

Java:
```java
class Solution {
    public int search(int[] nums, int target) {
        int init = 0;
        int last = nums.length - 1;
        return search(nums, target, init, last);
    }

    public int search(int[] nums, int target, int init, int last) {
        if(init > last) {
            return -1;
        } else {
            int mid = init + (last - init) / 2;
            if (target ==  nums[mid]) return mid;
            else if (target > nums[mid]) return search(nums, target, mid+1, last);
            else return search(nums, target, init, mid-1);
        }
    }
}
```

Kotlin:
```kotlin
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val init = 0
        val last = nums.size - 1
        return search(nums, target, init, last)
    }

    fun search(nums: IntArray, target: Int, init: Int, last: Int): Int {
        if (init > last) {
            return -1
        } else {
            val mid = init + (last - init) / 2
            if (target == nums[mid]) return mid
            else if (target > nums[mid]) return search(nums, target, mid + 1, last)
            else return search(nums, target, init, mid - 1)
        }
    }
}
```

