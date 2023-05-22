package apnacollegep;
import java.util.Scanner;
public class towerOfHenoi {
    public static void toh(int n,String src,String hpr,String des){
        if(n==1){
            System.out.println("tranfer disk "+n+" from "+src+" to "+des);
            return;
        }
        toh(n-1,src,des,hpr);
        System.out.println("tranfer disk "+n+" from "+src+" to "+des);
        toh(n-1,hpr,src,des);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,"S","H","D");
    }
}
