package leetcode;

import java.util.Scanner;

public class sqrtx {
    public static int mySqrt(int x) {
//       when i did in the ordinary method without (i+1)*(i+1)>x condition
//                        and used int for i it didn't work ,i think it has gone out of the int
//            s0 i use double for i
        double i = 0;
        while (i*i <= x) {

//            really important condition
            if(i*i <= x && (i+1)*(i+1)>x) {
                return (int)i;

            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int s = sc.nextInt();
        System.out.println(mySqrt(s));
    }
}
