package daily;

import java.util.Scanner;

public class paircubecount {
    public static int pairCubeCount(int N) {
        int c=0;
        for(int i=1;i<=Math.cbrt(N);i++)
        {
            if(Math.pow(i,3)==N)
            {
                c++;
            }
            else{
                int ans=(int)(Math.cbrt(N-Math.pow(i,3)));
                if(Math.pow(ans,3)+Math.pow(i,3)==N)
                {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String []args)
    {
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int p=pairCubeCount(N);
        System.out.println(p);
    }
}
