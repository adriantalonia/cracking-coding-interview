package _004_interview_preparation._03_leetcode._grind75._015_ransom_note;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) < 1) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }


}
