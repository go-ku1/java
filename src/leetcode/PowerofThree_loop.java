package leetcode;

public class PowerofThree_loop {
    public static  boolean isPowerOfThree(int n) {
        double pdt =1;
        int i=0;
        while(pdt<=n){
            if(pdt==n){
                return true;
            }
            pdt*=3;
            i++;
        }
        return false;
    }
    public static void main(String[] args){
       System.out.println(isPowerOfThree(129140163));
    }
}

//snippet using other loop,here we divide from the n and each time n should be divsible by 3
//while(n>3){
//    if(n%3!=0){
//        return false;
//        }
//    n=n/3;
//     }
//return true


//another important ways is:
//        n = 3 ^ i
//        i = log3(n)
//        i = log(n) / log(3)
//
//therfore if n is power of 3 ,then i should be an integer

//public boolean isPowerOfThree(int n) {
//        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
//        }