package leetcode;

public class ReverseString_recursion {
    public static void reverseString(char[] s) {
//        make another function to execute the function,to pass i and j each time
        rev(s,0,s.length-1);
    }
    public static void rev(char[] s,int i,int j){
        if(i>=j){
            return;
        }
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
//            we write the swap or the step before the recursive call
//            if we want to excecute steps going up the recursion,we can use this
//                this is like a replace to loop
//        To excecute while coming backwards,write steps after recursive call
            rev(s,++i,--j);


    }
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char c:s){
            System.out.print(c);
        }
    }
}
