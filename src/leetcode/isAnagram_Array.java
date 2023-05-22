package leetcode;

import java.util.Arrays;

public class isAnagram_Array {
    public static boolean isAnagram(String s, String t) {
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
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
