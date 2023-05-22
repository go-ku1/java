package leetcode_med;

public class LongestPalindromicSubstring_expandingfrommiddle {
    static int lo,maxLeng=0;
    public static String longestPalindrome(String s) {
        for(int i=0;i<s.length()-1;i++){
            expandPalin(s,i,i);//for odd,i is middle
            expandPalin(s,i,i+1);//for even,i isnthe2 middle elements
        }
        return s.substring(lo,lo+maxLeng);
    }
    public static void expandPalin(String s,int j,int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
            // j is going to left from middle
            // k is going to right from middle
        }
        if(maxLeng<k-j-1){
            lo=j+1;
            maxLeng=k-j-1;
        }
    }
    public static void main(String[] args){
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
