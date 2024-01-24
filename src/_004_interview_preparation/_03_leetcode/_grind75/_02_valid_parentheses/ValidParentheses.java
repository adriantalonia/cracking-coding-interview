package _004_interview_preparation._03_leetcode._grind75._02_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "[[(())]]";

        System.out.println("Test 1: () = " + isValid(s1));
        System.out.println("Test 2: ()[]{} = " + isValid(s2));
        System.out.println("Test 3: (] = " + isValid(s3));
        System.out.println("Test 4: [[(())]] = " + isValid(s4));
    }

    public static boolean isValid(String s) {

        /*Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');*/

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

        return stack.empty();
    }
}
