package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidAnagram_hashmap {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
//            we map each element to 0 and increses its frequency as it appears ,so at last we have no of times
//                    an element occurs in the word in map
            int freq1 = mp.getOrDefault(s.charAt(i), 0);
            mp.put(s.charAt(i), freq1 + 1);
        }
        for (int i = 0; i < t.length(); i++) {
//            map edited here is the same.it contains no of each character
//            here,when a character appears,we decrease the frequency of that charcter
            int freq2 = mp.getOrDefault(t.charAt(i), 0);
            mp.put(t.charAt(i), freq2 - 1);
//            when the loop ends freq of all characters must be 0
        }
//        important step of iterating through the map using set
        Set<Character> keys = mp.keySet();
        for (Character key : keys) {
            if (mp.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "gram";
        String str2 = "ragm";
        System.out.println(isAnagram(str1, str2));
    }
}
