package com.company;
import java.util.Scanner;
public class SumOFDigits
{
    public static void main(String[] args)
    {
        int n,a,sum=0,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
          a=n%10;
          sum=sum+a;
            n=n/10;

        }
        System.out.println("the sum of digits of "+n1+" is "+sum);
    }
}
