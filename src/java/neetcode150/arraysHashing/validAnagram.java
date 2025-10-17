package java.neetcode150.arraysHashing;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {

    public boolean isAnagram(String s, String t){
        Map<Character,Integer> count = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }

        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
