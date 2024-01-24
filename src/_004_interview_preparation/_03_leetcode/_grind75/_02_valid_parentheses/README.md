# 2. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


# Intuition
The problem involves checking if a given string containing various types of brackets is valid. The key idea is to use a stack to keep track of opening brackets and ensure that each closing bracket matches the last opening bracket.

# Approach
Utilize a stack to traverse the input string. For each character:
- If it's an opening bracket, push it onto the stack.
- If it's a closing bracket, pop the stack and check if it matches the corresponding opening bracket.
- If there is any mismatch or if the stack is not empty at the end, return false; otherwise, return true.
- Use a map to efficiently determine the matching opening bracket for each closing bracket.

# Complexity
- Time complexity:
  The time complexity is O(n), where n is the length of the input string. This is because we iterate through the string once, and each operation inside the loop takes constant time.


- Space complexity:
  The space complexity is O(n), where n is the length of the input string. In the worst case, the stack could have all opening brackets, and the map requires O(1) space.

# Code
Java:
```java
class Solution {
    public boolean isValid(String s) {
        
         Map<Character, Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (bracketMap.containsValue(c)) { // opening bracket
                stack.push(c);
            } else if (bracketMap.containsKey(c)) { // closing bracket
                if (stack.empty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
```


Kotlin:
```kotlin
class Solution {
    fun isValid(s: String): Boolean {
        val bracketMap = mapOf(')' to '(', '}' to '{', ']' to '[')

        val stack = Stack<Char>()

        for (c in s) {
            if (bracketMap.containsValue(c)) { // opening bracket
                stack.push(c)
            } else if (bracketMap.containsKey(c)) { // closing bracket
                if (stack.isEmpty() || stack.pop() != bracketMap[c]) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}
```