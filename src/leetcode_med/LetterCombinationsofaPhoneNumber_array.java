package leetcode_med;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber_array {
//    here the return type is List<String>,so we need to crete li to carry results
    public static List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList<>();
//        Strings in array indexed with respect to to their corresponding digit
//         we dont need mapping here,because the keys here are 0,1,2,3,4,5,6,7,8,9.
//                so we can just consider key as index and store the respective values
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) {
            return li;
        }

        li.add("");
//going through each character digit and coverting it to index(integer  of the character didit)
        for (int i = 0; i < digits.length(); i++) {
//            character digit converted to intger didit
//            Character.getNumericValue(digit) can also be used to convert charcter digit to integre digit
//            String.valueOf(x),coverts x which is a character or integr to string"x"
            int index = digits.charAt(i) - '0';
//            so we are paasing the word of that number and the list=""
            li = combine(arr[index], li);
        }
        return li;
    }
    public static List<String> combine(String ar,List<String> l){
        List<String> li=new ArrayList<>();
//        loops through the word(abc) of the number 2
//                2nd call:
//        loops through the word(def) of the number 3
        for(int i=0;i<ar.length();i++){
            for(String s:l){
//                here l="",so no s,li.add(a),....a b c are added seperatly to li
//                                  li.add(b)
//                                  li.add(c)
//                2nd call:
//                 here l="a"-"b"-"c"->arraylist
//                        s thru a,b,c....li.add('a'+'d'),li.add('a'+'e'),li.add('a'+'f')
//                                            li.add('b'+'d'),li.add('b'+'e'),li.add('b'+'f')
//                                            li.add('c'+'d'),li.add('c'+'e'),li.add('c'+'f')
                li.add(s+ar.charAt(i));
            }
        }
        return li;
    }
    public static void main(String[] args){
        System.out.println(letterCombinations("23"));
    }
}
