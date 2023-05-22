package leetcode;

public class ClimbingStairs {
    public static int fib(int s){
//        this array stores their respective way to reach the ith stair
        int ar[]=new int[s];
        ar[0]=1;
        ar[1]=1;

        for(int i=2;i<s;i++)
        {
            ar[i]=0;
            for(int j=0;j<=i && j<=2;j++){
//                number of ways of doing nth stair is=num of ways of to get to (n-1)th stair+num of ways of to get to (n-2)th stair
//                j varies from 0(no effect)and 1 and 2...so we get (n-1) and (n-2)
//                this is just the fibonacii series,we can do by the ordinary recursion method
//                        by return fib(n-1)+fib(n-2)
                ar[i]=ar[i]+ar[i-j];
            }
        }
        return ar[s-1];
    }
    public int climbStairs(int n) {
        return fib(n+1);
    }
}
