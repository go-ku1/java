package arrays;
import java.util.Scanner;
public class AdditionOfMatrices
{
    public static void main(String[] args)
    {
      int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns respectively") ;
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int s[][]=new int[r][c];
        System.out.println("enter 1st matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter 2nd matrix");
        for(i=0;i<r;i++)
        {
             for(j=0;j<c;j++)
            {
            b[i][j]=sc.nextInt();
            }
        System.out.println();
         }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                s[i][j]=a[i][j]+b[i][j];
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

    }
}
