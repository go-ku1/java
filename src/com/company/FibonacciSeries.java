package com.company;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int i,a=0,b=1,c=1;
        System.out.print(a+""+b+" ");
       for(i=0;i>=0;i++)
       {
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
       }
    }
}
