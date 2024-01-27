# Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

# Intuition
The intuition behind this solution is to use a two-pointer approach to traverse the given string from both ends. During the traversal, characters are checked for alphanumeric properties, and non-alphanumeric characters are skipped. Uppercase letters are converted to lowercase for case-insensitive comparison. The two pointers move towards each other until they meet or cross, and the characters at corresponding positions are compared to determine if the string is a palindrome.

# Approach
1) Initialize two pointers, i and j, at the beginning and end of the string, respectively.
2) Use a while loop to iterate through the string until i is greater than or equal to j.
3) At each iteration, retrieve alphanumeric characters from both i and j, converting uppercase to lowercase for case-insensitive comparison.
4) If the characters are not equal, return false as the string is not a palindrome.
5) Move the pointers towards each other and continue the loop.
6) If the loop completes without encountering a mismatch, return true as the string is a palindrome.

# Complexity
- Time complexity:
  O(n), where n is the length of the input string. The while loop iterates through the string once, and each iteration involves constant-time operations.

- Space complexity:
  O(1), as the algorithm uses a constant amount of additional space regardless of the input size. The space required for variables i, j, and temporary characters is constant.

# Code

Java:
```java
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;

        while (i<j) {
            char ci = lowercaseAlphaNumeric(s.charAt(i));
            if (ci == 0) {
                i++;
                continue;
            }
            char cj = lowercaseAlphaNumeric(s.charAt(j));
            if (cj == 0) {
                j--;
                continue;
            }
            if (ci != cj) return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * If c is alphanumeric returns lowercase c, otherwise, 0
     */
    private char lowercaseAlphaNumeric(char c) {
        if ((c >=48 && c <= 57) // 0-9
                || (c >= 97 && c <= 122)) // a-z
            return c;
        else if (c >= 65 && c <= 90) return (char)(c+32); // A-Z
        return 0;
    }
}
```

Kotlin:
```kotlin
class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1

        while (i < j) {
            val ci = lowercaseAlphaNumeric(s[i])
            if (ci == 0.toChar()) {
                i++
                continue
            }
            val cj = lowercaseAlphaNumeric(s[j])
            if (cj == 0.toChar()) {
                j--
                continue
            }
            if (ci != cj) return false
            i++
            j--
        }
        return true
    }

    /**
     * If c is alphanumeric returns lowercase c, otherwise, 0
     */
    private fun lowercaseAlphaNumeric(c: Char): Char {
        return when {
            (c in '0'..'9') || (c in 'a'..'z') -> c
            (c in 'A'..'Z') -> (c + 32).toChar()
            else -> 0.toChar()
        }
    }
}
```