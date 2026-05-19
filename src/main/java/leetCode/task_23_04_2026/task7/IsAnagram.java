package leetCode.task_23_04_2026.task7;

import java.util.HashSet;
import java.util.Set;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (!set.contains(s.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
