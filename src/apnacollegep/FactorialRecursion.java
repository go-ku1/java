package apnacollegep;
import java.util.Scanner;
public class FactorialRecursion
{
    public static void fact(int n,int i,int f)
    {
        if(n==i)
        {
            f=f*i;
            System.out.println(f);
            return;
        }
        f=f*i;
        fact(n,i+1,f);

    }
    public static void main(String[] args) {

        Scanner lo = new Scanner(System.in);

        System.out.println("enter");
        int n = lo.nextInt();
        fact(n, 1, 1);
    }



    }

