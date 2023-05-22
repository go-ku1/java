package com.company;

public class Pattern2
{
     public static void main(String[] args)
     {
         int i,j,k,s=1,sum=1;
         for(i=1;i<=4;i++)
         {
             for(j=1;j<=4-i;j++)
             {
                 System.out.print(" "+" ");
             }
             for(k=1;k<=s;k++)
             {
                 if(k%2!=0)
                     System.out.print("*"+" ");
                 else
                     System.out.print(" "+" ");

             }
             s=s+2;
             System.out.println("");
         }
         System.out.println("");
         for(i=1;i<=4;i++)
         {
             for(j=1;j<=4-i;j++)
             {
                 System.out.print(" "+" ");
             }
             for(k=1;k<=i;k++)
             {
                 System.out.print(sum+" "+" "+" ");
                 sum=sum+1;
             }
             System.out.println("");
         }
         System.out.println("");
          for(i=1;i<=7;i++)
          {
              if(i<=4)
              {
                  for(j=1;j<=i;j++)
                  {
                  System.out.print("*"+" ");

                   }
              }
              else
              {
                  for(j=8-i;j>=1;j--)
                  {
                      System.out.print("*"+" ");
                  }
              }
              System.out.println("");
          }
         System.out.println("");
          String st="";
          for(i=1;i<=5;i++)
          {
              if(i>2&&i<5)
              {
                  for(j=1;j<=i-2;j++)
                  {
                      st=st+" ";
                  }
                  System.out.print("* " + st+ " *");

              }
              else
              {
                  for(j=1;j<=i;j++)
                      System.out.print("*"+" ");
              }
              System.out.println("");
          }

     }
}
