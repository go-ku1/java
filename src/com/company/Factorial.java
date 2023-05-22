
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,fact=1;
        System.out.println("enter the number whose factorial is to be found");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           fact=fact*i;
        }
            System.out.print("the factorial "+n+" is "+ fact);

    }
}