package leetcode;

import java.util.Scanner;

public class sqrtx_binarysearch {
    public static int mySqrt(int x){
        long start=1;
        long end=x/2,mid;
        long ans=0;
        while(start<=end) {
            mid = (start + end) / 2;
//            when its a perfect square ,then at any point of the while while loop the
//                    condition may be satisfied
            if(mid*mid==x){
                return (int)mid;
//                here mid is of long datatype so it needs to be converted into
//                integer during returning as function type is int
            }
//            mid the changing value,it needs to be edited
//            the mid is too low here to reach x,so we need to increse its value,
//                    so it must be in the right half
            if(mid*mid<x){
                start=mid+1;
                ans=mid;
//                here we need to store the value of mid each time
//                        because mid is the value to which we filter our
//                        square root into
//                if the x is not perfect square,then it wouldnt have return a  value until while condition ,
//                so when it gets out of while loop,it must return the ans
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int s = sc.nextInt();
        System.out.println(mySqrt(s));
    }
}
