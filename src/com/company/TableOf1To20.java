package com.company;

public class TableOf1To20

{
    public static void main(String[] args)
    {
        int i,j,p;
        String s;
        for(i=1;i<=10;i++)
        {
            if(i==10)
                System.out.print(i+" ");
            else
            System.out.print(i+"  ");

            for(j=1;j<=20;j++)
            {
                p=i*j;
                if(p>99)
                     s=" ";
                else if(p>9)
                     s="  ";
                else
                    s="   ";

                System.out.print(i*j+s);
            }
          System.out.println("");
        }
    }
}
