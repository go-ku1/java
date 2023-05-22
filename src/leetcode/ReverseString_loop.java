package leetcode;

public class ReverseString_loop{
        public static void reverseString(char[] s) {
            int j=0;
//            here we do replacing of values till almost the middle (i>=j),because 2nd half get automatiaclly changed
            for(int i=s.length-1;i>=j;i--){
//                i tried just s[j]=s[i]; insted of replacing but as the first half changes,we can just give the value
//                we need to replace it
                char temp=s[j];
                s[j]=s[i];
                s[i]=temp;
                j++;
            }
            for(char c:s){
                System.out.print(c);
            }
        }
    public static void main(String[] args){
       char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
