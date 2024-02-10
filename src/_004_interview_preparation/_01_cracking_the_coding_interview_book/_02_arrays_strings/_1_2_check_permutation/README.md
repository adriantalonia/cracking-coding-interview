# Check Permutation

This Java program checks if one string is a permutation of the other.

## Intuition
The problem requires determining whether one string is a permutation of the other. This means that the two strings have the same characters, but possibly in a different order.

## Approach
The code provides two approaches to solve the problem:
1. The `permutation` method sorts both strings and then compares them. If the sorted strings are equal, then one is a permutation of the other.
2. The `permutation2` method uses an array to count the occurrences of characters in the first string (`s`) and then decrements the count for each character encountered in the second string (`t`). If all counts in the array become zero after traversing both strings, then one string is a permutation of the other.

## Complexity
- Time complexity:
    - Approach 1: Sorting both strings takes O(n log n) time, where n is the length of the strings. Comparing the sorted strings takes linear time, so the overall time complexity is O(n log n).
    - Approach 2: Traversing both strings once takes linear time, so the time complexity is O(n).
- Space complexity:
    - Approach 1: Sorting the strings requires extra space, but it's not dependent on the input size, so the space complexity is O(1).
    - Approach 2: Using an array to count characters requires constant space as the size of the array is fixed (128 in this case), so the space complexity is O(1).