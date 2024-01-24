package _004_interview_preparation._03_leetcode._grind75._02_valid_parentheses

import java.util.Stack

fun main() {
    val solution = Solution()

    val s1 = "()"
    val s2 = "()[]{}"
    val s3 = "(]"
    val s4 = "[[(())]]"

    println("Test1 () = ${solution.isValid(s1)}")
    println("Test2 ()[]{} = ${solution.isValid(s2)}")
    println("Test3 (] = ${solution.isValid(s3)}")
    println("Test4 [[(())]] = ${solution.isValid(s4)}")
}

class Solution {
    fun isValid(s: String): Boolean {
        val bracketMap = mapOf(')' to '(', ']' to '[', '}' to '{')

        val stack = Stack<Char>()

        for (c in s) {
            if (bracketMap.containsValue(c)) {
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (stack.empty() || stack.pop() != bracketMap[c]) {
                    return false
                }
            }
        }
        return stack.empty()
    }
}