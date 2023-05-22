package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_ifelse {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                li.add("Fizz");
            }
            else if(i%3!=0 && i%5==0){
                li.add("Buzz");
            }
//            we could have written this condition first ,we didnt need (i%3!=0 && i%5==0),just (i%5==0)
            else if(i%3==0 && i%5==0){
//                i%15 can be used instead of this
                li.add("FizzBuzz");
            }
            else{
//                String.valueOf(i) function helps to take the value of the integer and convert it into string
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
