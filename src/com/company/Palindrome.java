package com.company;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        int n,n1,d,a,p=1,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        n1=n;
        d=(int)Math.log10(n)+1;
        while(n!=0)
        {
            a=n%10;
             for(i=1;i<d;i++)
             {
                 p=p*10;
             }
            sum=sum+a*p;
            n=n/10;
            d--;
            p=1;
        }
        if(sum==n1)
            System.out.println(n1+" is palindrome");
        else
            System.out.println(n1+" is not palindrome");
    }
}
