package leetcode;

import java.util.Scanner;

public class IndexoftheFirstOccurrence {
    public static  int strStr(String haystack, String needle) {
        int i;
        int l = needle.length();
        for (i = 0; i < haystack.length(); i++) {
            if(haystack.length()-i>=l)
            {
                if (haystack.substring(i, i + l).equals(needle)) {
                    return i;
                }
            }
            }

            return -1;
    }

    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter haystack");
        String haystack=sc.next();
        System.out.println("enter needle");
        String needle=sc.next();
        System.out.println("the first occurrence is at "+strStr(haystack,needle));
    }

}
