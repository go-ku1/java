package leetcode;

public class FirstUniqueCharacterinaString_array {
    public static int firstUniqChar(String s) {
        int[] alph=new int[26];
        for(int i=0;i<s.length();i++){
            alph[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(alph[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
