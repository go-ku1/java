package daily;
import java.util.Scanner;
public class IntegerToRoman {
    public static void ir(int n){
        int  ar_int[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ar_str[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<ar_int.length;i++){
            while(n>=ar_int[i]){
                n=n-ar_int[i];
                s.append(ar_str[i]);
            }


        }
        System.out.println(s.toString());

    }
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ir(n);

    }

}
