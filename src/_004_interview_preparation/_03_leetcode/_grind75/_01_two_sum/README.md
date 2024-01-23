# 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

# Intuition
The intuition behind this solution is to use a HashMap to keep track of the elements encountered so far. As we iterate through the array, we calculate the complement for each element (target minus the current element) and check if the complement exists in the map. If it does, we have found the pair of indices whose elements add up to the target.

# Approach
1. Initialize an empty HashMap (numMap) to store elements along with their indices.
2. Iterate through the array nums.
3. For each element nums[i], calculate the complement (target - nums[i]).
4. Check if the complement exists in the map (numMap.containsKey(complement)). If it does, return the indices of the two elements forming the pair.
5. If the complement is not found in the map, add the current element and its index to the map (numMap.put(nums[i], i)).
6. If no solution is found during the iteration, return an empty array.

# Complexity
- Time complexity: O(n)
    - The algorithm iterates through the array once, performing constant-time operations for each element.

- Space complexity: O(n)
    - The space complexity is determined by the size of the HashMap (numMap). In the worst case, when there are no duplicates in the array, the map can have at most n entries, where n is the length of the array.


# Code
Java code:
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
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
```

Kotlin code:
```kotlin
class Solution {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = HashMap<Int, Int>()
    for (i in nums.indices) {
      val complement = target - nums[i]
      if (numMap.containsKey(complement)) {
        return intArrayOf(numMap[complement]!!, i)
      }
      numMap[nums[i]] = i
    }
    return intArrayOf()
  }
}
```
 