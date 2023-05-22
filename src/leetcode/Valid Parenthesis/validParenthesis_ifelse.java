package leetcode;

import java.util.Scanner;

public class validParenthesis_ifelse {
    public static boolean isValid(String s){
        int i=-1;
        char st[]=new char[s.length()];

//        this statement stores  s to a character array with
//        each character in an index
//                and here c is the variable character which loops
//                through the array.here no index is required to loop through
//                a string
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                st[++i]=c;
            }
            else{
                if(st[i]=='{'&&c=='}' || st[i]=='('&&c==')' || st[i]=='['&&c==']'){
                    i--;
                }
                else{
                    return false;
                }
            }
        }
        return (i==-1);
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
