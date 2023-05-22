package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_ternary {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            li.add(
//                    instead of multiple if else statments ,we can consider using ternary operator
                    (i%15==0)?"FizzBuzz":(i%3==0)?
                              "Fizz":(i%5==0)?
                               "Buzz":String.valueOf(i)
            );
        }
        return li;
    }
    public static void main(String args[]) {
//        a list gets directly prinly by  SOP:[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz]
        System.out.print(fizzBuzz(20));
    }
}
