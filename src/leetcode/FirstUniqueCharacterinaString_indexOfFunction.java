package leetcode;

public class FirstUniqueCharacterinaString_indexOfFunction {
    public static int firstUniqChar(String s) {
//        this is a standard initial value given we need to find the minimum
        int ans=Integer.MAX_VALUE;
//        by giving c='x' ,we can compare c like an integer
        for(char c='a';c<='z';c++){
//            indexOf grts the index of first occurance of c
//            lastIndexOf gets the last index of occurance of c
            int ind=s.indexOf(c);
//            if first and last index equal ,they occur only once
            if(ind!=-1 && ind==s.lastIndexOf(c)){
//                gets all c which occur only once,and get which c occur at the minimum index
                ans= Math.min(ans,ind);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
