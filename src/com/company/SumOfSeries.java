package com.company;
import java.util.Scanner;

public class SumOfSeries
{
    public static void main(String[] args)
    {
        double i, sum=0;int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
     System.out.println("the sum of the series is " +sum);
    }
}
