package leetcode;

import java.util.Stack;

public class ReverseString_stack {
    public static void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for(char c:s){
            st.push(c);
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
