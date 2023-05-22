package leetcode;

import java.util.HashSet;

public class HappyNumber_hashset {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
//        checking that whether cycle is formed
//        storing all the sum to hs and if the sum repeats,breaks out of while
        while (!hs.contains(getSum(n))) {
               hs.add(getSum(n));
               n=getSum(n);
               if(getSum(n)==1) {
                   return true;
               }
        }
        return false;
    }
            public static int getSum(int n){
            int sum=0;
//        seperates numbers and add
            while(n>0){
                sum=sum+(n%10)*(n%10);
                n=n/10;
            }
            return sum;
        }
    public static void main(String args[]){
        System.out.println(isHappy(19));
    }

    }

