package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_noModulus {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> li=new ArrayList<>();
        int f=0,b=0;
        for(int i=1;i<=n;i++){
            f++;
            b++;
            if(f==3 && b==5){
                li.add("FizzBuzz");
                f=0;
                b=0;
            }
            else if(f==3){
                li.add("Fizz");
                f=0;
            }
            else if(b==5){
                li.add("Buzz");
                b=0;
            }
            else{
                li.add(String.valueOf(i));
            }
        }
        return li;
    }
    public static void main(String args[]) {
//        a list gets directly prinly by  SOP:[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz]
        System.out.print(fizzBuzz(20));
    }
}
