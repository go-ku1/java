package apnacollegep;
import java.util.Scanner;
public class stack_recursion
{
    public static int sh(int x,int n)
    {
     if(n==0)
     {
         return 1;
     }
     if(x==0)
        {
            return 0;
        }
     int mpower=sh(x,n-1);
     int power=x*mpower;
     return power;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and n");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=sh(x,n);
        System.out.println(ans);
    }
}
