package leetcode;

import java.util.Stack;
import java.util.Scanner;

public class validParentheses {
    public static boolean isValid(String s) {

//        initialise  a stack.this question is related to
//        symmetry.so i think we can use stack
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

//            when the opening bracket comes.the next character must
//            either be a closing bracket of same type or any other opening bracket
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) {
                    return false;
                }
                   switch (ch){
                       case'}':
                           char c;
                           c=st.pop();
                           if(c=='['||c=='(') {
                               return false;
                           }
                           break;

                       case']':
                           c=st.pop();
                           if(c=='{'||c=='(') {
                               return false;
                           }
                           break;

                       case')':
                           c=st.pop();
                           if(c=='['||c=='{') {
                               return false;
                           }
                           break;

                   }
                }
            }

        return  st.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String s=sc.next();

        if(isValid(s)){
            System.out.print("valid");
        }
        else
            System.out.print("Invalid");
    }

}
