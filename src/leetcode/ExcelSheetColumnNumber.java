package leetcode;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int sum=0;
//        for loop in an array can always e made to this form
//        toCharArray to convert any string toa character array
        for(char c:columnTitle.toCharArray()){
            //BCM
//                sum=0,sum=2;
//                sum=2x26,sum=2x26+3;
//                sum=(2x26+3)x26,sum=(2x26+3)x26+13
            sum=sum*26;
            //+1 to compensate the -'A'
//            any character-'any alphabet' gives the difference in ascii
            sum=sum+(c-'A'+1);
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(titleToNumber("BCM"));
    }
}
