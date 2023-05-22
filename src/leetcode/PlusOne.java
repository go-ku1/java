package leetcode;

import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int l=digits.length;
        int i;

        for(i=l-1;i>=0;i--){
            if(digits[i]<9){
                digits[l-1]=digits[l-1]+1;
                return digits;

            }

            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0]=1;

        return digits;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("enter the numbers of the array");
        for(int j=0;j<n;j++){
            num[j]=sc.nextInt();
        }
        System.out.println("the array is "+plusOne(num));

    }
}
