package _004_interview_preparation._03_leetcode._grind75._01_two_sum

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9
    println("Example 1: ${solution.twoSum(nums1, target1).contentToString()}")

    val nums2 = intArrayOf(3, 2, 4)
    val target2 = 6
    println("Example 2: ${solution.twoSum(nums2, target2).contentToString()}")

    val nums3 = intArrayOf(3, 3)
    val target3 = 6
    println("Example 3: ${solution.twoSum(nums3, target3).contentToString()}")
}

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