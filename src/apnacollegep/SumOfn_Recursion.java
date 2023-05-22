package apnacollegep;
import java.util.Scanner;
public class SumOfn_Recursion
{

    public static void sum(int n,int i,int su)
    {
        if(n==i)
        {
            su=su+i;
            System.out.println(su);
            return ;
        }

        su=su+i;
        sum(n,i+1,su);
        System.out.println("enter");


    }
    public  static void main(String[] args)
    {
       int su=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        sum(n,1,0);

    }
}
