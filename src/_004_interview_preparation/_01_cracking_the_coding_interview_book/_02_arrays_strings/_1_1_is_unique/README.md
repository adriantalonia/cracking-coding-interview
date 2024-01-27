# Is Unique

Implement an algorithm to determine if a string has all unique characters
what if you cannot use additional data structures

# Method: isUniqueChars

```java
public static boolean isUniqueChars(String str) {
        // ASCII
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { // already found this char in string
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }
```

# Intuition:
The intuition behind this method is to use a boolean array of size 128 (assuming ASCII characters) to keep track of characters encountered in the string. If a character is encountered more than once, the function returns false, indicating that the string does not have all unique characters.

# Approach:
- Check if the length of the input string is greater than 128. If it is, then there must be repeated characters, so return false.
- Create a boolean array char_set of size 128 to mark whether a character has been encountered.
- Iterate through each character in the string:
- Convert the character to its ASCII value (val).
- If char_set[val] is already true, return false as the character has been encountered before.
- Otherwise, set char_set[val] to true.
- If the loop completes without returning false, then all characters are unique, and the function returns true.

# Complexity:
- Time Complexity: O(n), where n is the length of the input string. The loop runs through each character once.
- Space Complexity: O(1), as the boolean array char_set is a constant size (128).

# Method: isUniqueChars2

```java
public static boolean isUniqueChars2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
```

# Intuition:
This method uses a bitwise manipulation approach to reduce the space complexity compared to the first method. It maintains a 32-bit integer (checker) where each bit represents the presence of a character in the string.

# Approach:
- Initialize checker to 0.
- Iterate through each character in the string:
- Convert the character to its ASCII value (val).
- Check if the corresponding bit in checker is already set. If it is, return false.
- Set the corresponding bit in checker using bitwise OR (checker |= (1 << val)).
- If the loop completes without returning false, then all characters are unique, and the function returns true.
# Complexity:
- Time Complexity: O(n), where n is the length of the input string. The loop runs through each character once.
- Space Complexity: O(1), as it uses a single integer (checker) of fixed size.


Both methods have linear time complexity with respect to the length of the input string and constant space complexity, making them efficient for checking uniqueness of characters in a string.