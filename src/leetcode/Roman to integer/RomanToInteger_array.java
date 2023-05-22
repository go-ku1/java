package leetcode;
import java.util.Scanner;

public class RomanToInteger_array {
    public static int value(char c) {
        int k=0;
        char ar_s[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int ar_i[] = {1000, 500, 100, 50, 10, 5, 1};
        for (int j = 0; j < ar_s.length; j++) {
            if (c == (ar_s[j])) {
                k = ar_i[j];
            }

        }
        return k;
    }

    public static int Rti(String s) {
        int num1, num2 = 0, sum = 0;
        for (int h = 0; h < s.length(); h++) {
            num1 = value(s.charAt(h));

//            if the last character of s has been reached ,then
//            h+1 character is not there.so the following statements
//            needs to be excecuted only when h is not the last element
            if (h + 1 < s.length()) {
                num2 = value(s.charAt(h + 1));

//                very important logic
                if (num1 >= num2) {
                    sum = sum + num1;
                }
//                following case when 2 characters comes together like IV,XC,CM etc.so
//                that the 2nd letter doesnt need to be considered
                else {
                    sum = sum + num2 - num1;
//                    incrementing h so that the second character is negleted
                    h++;
                }
            }

//            when h is the last letter,it has no more letters after .so directly add
            else{
                sum=sum+num1;
            }
        }
        return sum;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(Rti(s));
    }
}


