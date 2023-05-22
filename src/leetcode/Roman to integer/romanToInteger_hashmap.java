package leetcode;
import java.util.HashMap;
import java.util.Scanner;

//this program is similar to the the array program of the previous question
//instead of storing  pairs through array and loop,we use hashmaps
public class romanToInteger_hashmap {
    public static int rti(String s) {

//        this hashmap below is similar to the  value function we used to
//        to get the value for that particular character
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num1 = map.get(s.charAt(i));
            if (i < s.length() - 1 && map.get(s.charAt(i + 1)) > num1) {
                sum = sum + map.get(s.charAt(i + 1)) - num1;
                i++;
            }
            else {
                sum = sum + num1;
            }
        }
        return sum;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       System.out.print(rti(s));
    }

}
