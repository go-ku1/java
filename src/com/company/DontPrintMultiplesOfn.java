package com.company;
import java.util.Scanner;
public class DontPrintMultiplesOfn

{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose multiple need not be displayed");
        n=sc.nextInt();
        for(i=1;i<=100;i++)
        {
            if(i%n==0)
            {
                System.out.println("multiple of "+n);
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
