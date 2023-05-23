package leetcode_med;

public class StringtoInteger_atoi_ifandloop {
    public static int myAtoi(String s) {
        int i=0;
//        the spaces at the beginning of string are skipped
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        boolean isNeg=false;
//the we have sign of the number after the space.which we finds out
        if(i<s.length()){
            if(s.charAt(i)=='-'){
                isNeg=true;
                i++;
            }
            else if(s.charAt(i)=='+'){
                i++;
            }
        }
        int res=0;
        while(i<s.length() && isDigit(s.charAt(i))){

//            if its a number ,5..then '5'-'0' will give the diffrence bw their
//                    ascii numbers,which the 5.
//            s.charAt(i) gives a charcter,if its a charcter->letter(say h) we use =s.charAt(i)-'a' to get
//                    the ascii no or order of character from 'a' as an integer.
//            ascii of h-ascii of a----->intger
//          (  ascii of h-ascii of a+1) position of character in alphabetical system

//            s.charAt(i) gives a charcter,if its a character->digit(5), we use =s.charAt(i)-'0'=5(intger) to get
//                    the ascii no or order of character from 'a' as an integer.
//            therefore this character->digit is now coverted to an integer
//            '5'---->5

            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE/10) || (res==(Integer.MAX_VALUE/10) && digit>7)){
                return isNeg?Integer.MIN_VALUE:Integer.MAX_VALUE;
             }
            res=res*10+digit;
            i++;
        }
        return isNeg?-res:res;
    }
//    checks if the digit is a number
    public static boolean isDigit(char c){
//        '' helps to compare characters with
//        here we cant put 'c'as its general,so we convert 0 and 9 to character
//                and ascii values are compared..
//        we can only compare or operate 2 integers(ascii values)
//            not 2 characters
        if(c>='0'&& c<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.print(myAtoi("4193 with words"));
    }
}

//    so whenever u compare or operte 2 character..eg(s.charAt(i)-'a')here their ascii values are subtracted
//        ..                                     ..eg(c>='0')here their ascii values are compared