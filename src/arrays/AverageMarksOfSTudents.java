package arrays;
import java.util.Scanner;
public class AverageMarksOfSTudents
{
    public static void main(String[] args)
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students in the class");
        n=sc.nextInt();
        int marks[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter the marks of roll no "+(i+1));
            marks[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("the average marks of the class is "+sum/n);
    }
}
