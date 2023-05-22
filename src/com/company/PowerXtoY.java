package com.company;
import java.util.Scanner;
public class PowerXtoY
{
    public static void main(String[] args)
    {
        int i, x,p=1, y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of x and y respectively");
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=0;i<y;i++)
        {
            p=p*x;
        }
        System.out.println("value of x^y is "+p);
    }

}
