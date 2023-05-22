package leetcode;

public class isAnagram_AsciiSumSame {
    public static boolean isAnagram(String s, String t) {
        int[] alpha=new int[26];
//        making an array for the 26 characters to store the number of occurance of each character
//        in map,we only mapped the elments in the string to their occurance but here there is an array for the whole 26 character
        for(int i=0;i<s.length();i++){
//            when x occurs in s,we increse the respective number of x
            alpha[s.charAt(i)-'a']++;
//            when x occurs in t,we decrese the respective number of x
            alpha[t.charAt(i)-'a']--;
        }
//        to loop throught the index of an array alpha using the variable i
        for(int i:alpha){
//            frequency of each caharcer must be 0 at end
            if(alpha[i]!=0){
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
