package _004_interview_preparation._03_leetcode._grind75._05_valid_palindrome;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println("A man, a plan, a canal: Panama is palindrome? : " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("A man, a plan, a canal: Panama is palindrome? : " + isPalindrome2("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {

        if (s.isBlank()) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        var init = 0;
        var end = s.length() - 1;

        while (init <= end) {
            if (s.charAt(init) == s.charAt(end)) {
                init++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
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
    private static char lowercaseAlphaNumeric(char c) {
        if ((c >=48 && c <= 57) // 0-9
                || (c >= 97 && c <= 122)) // a-z
            return c;
        else if (c >= 65 && c <= 90) return (char)(c+32); // A-Z
        return 0;
    }
}
