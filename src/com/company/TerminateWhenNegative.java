package com.company;
import java.util.Scanner;
public class TerminateWhenNegative
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        for(i=0;i>=0;i++)
        {
            System.out.println("enter the number");
                    n=sc.nextInt();
            if(n<0)
            {
        System.out.println("the number you hava entered is negative");
                break;}
        }
    }
}
