package apnacollegep;
import java.util.Scanner;


public class SumNum
{
    public static int sumOfNum(int a,int b)
    {
        int s=a+b;
        System.out.println("the sum is "+s);
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sumOfNum(a,b);
    }
}
