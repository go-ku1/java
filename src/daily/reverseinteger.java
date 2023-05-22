package daily;
import java.util.Scanner;

public class reverseinteger {
    public static void rev(int n) {
        while (n != 0) {
            int x = n % 10;
            n = n / 10;
            System.out.print(x);
        }
    }
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            rev(n);
        }



    }

