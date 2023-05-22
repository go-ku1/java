package com.company;

public class Pattern1
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                System.out.print("*"+"  ");
            System.out.println("");
        }
        System.out.println("");
       for(i=1;i<=4;i++)
       {
           for(j=1;j<=4;j++)
           {
               if(j>i)
                   System.out.print(" "+"  ");
               else
                   System.out.print("*"+"  ");
           }
           System.out.println("");
       }
        System.out.println("");
          for(i=4;i>=1;i--)
          {
              for(j=4;j>=1;j--)
              {
                  if(j>i)
                      System.out.print(" "+"  ");
                  else
                      System.out.print("*"+"  ");
              }
              System.out.println("");
          }
    }
}

