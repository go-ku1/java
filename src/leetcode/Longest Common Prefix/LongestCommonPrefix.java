package leetcode;
import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        int l=strs.length;
        if(l==0){
            return "";
        }
        if(l==1){
            return strs[0];
        }
//        this "Arrays.sort()"is actually imported from java.util.Arrays
        Arrays.sort(strs);

        int last=Math.min(strs[0].length(),strs[l-1].length());
        int i=0;
        while(i<last && strs[0].charAt(i)==strs[l-1].charAt(i)){
            i++;
        }
        String s=strs[0].substring(0,i);

        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of the array");
        int n=sc.nextInt();
        String st[]=new String[n];
        System.out.print("enter the words of the array");
        for(int j=0;j<n;j++){
            st[j]=sc.next();
        }
        System.out.println(longestCommonPrefix(st));
    }
}
