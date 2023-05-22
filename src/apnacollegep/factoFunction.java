package apnacollegep;
import java.util.Scanner;

public class factoFunction
{
    public static int facto(int n)
    {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("the factorial is "+facto(n));

    }
}
