package com.company;
import java.util.Scanner;
public class Primeno
{
    public static void main(String[] args)
    {
        boolean b= false;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to check");
      int n=sc.nextInt();
      for(int i=2;i<n;i++)
      {
          if (n % i != 0)
               b = true;
          break;
      }
      if(b=true)
              System.out.println("The no is prime");
          else
              System.out.println("the no is not prime");


    }

}
