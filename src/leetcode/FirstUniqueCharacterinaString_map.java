package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString_map {
    public static int firstUniqChar(String s) {
        int j;
        char[] str = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i <= str.length - 1; i++) {
            int frq = mp.getOrDefault(str[i], 0);
            mp.put(str[i], frq + 1);
        }
        for (j = 0; j < str.length; j++) {
            if (mp.get(str[j]) == 1) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
