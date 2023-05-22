package apnacollegep;
import java.util.Scanner;
public class fibinacci_recursion
{
    public static void fib(int n,int i, int a, int b,int c)
    {
        if(n-2<i)
        {
            return;
        }
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        fib(n,i+1,a,b,c);
            
    }
    public static void main(String [] args)
    {
        int a=0;
        int b=1;
        Scanner myran=new Scanner(System.in);
        System.out.println("enter");
        int n=myran.nextInt();
        System.out.println(a);
        System.out.println(b);

        fib(n,1,a,b,0);


    }
}
