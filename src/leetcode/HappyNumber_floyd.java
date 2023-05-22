package leetcode;
//the program is similar to finding cycle in an ll
//we did it by floyd method and hashset.but here,if there is a cycle then
//the sum never turns to 1 ,therefore not happy number
public class HappyNumber_floyd {
    public static boolean isHappy(int n) {
        int s = n;
        int f = n;
        do {
//            slow and fast
            s = getSum(s);
            f = getSum(getSum(f));
//            if there is no repeating of sum,then s at some point will be 1
//                    wecheck for s because s goes through every sum of n,
//            but f skip alternate sums
            if(s==1) {
                return true;
            }
        } while (s != f);
//        once s==f then means there is a cycle then no happy
        return false;
    }

    public static int getSum(int n){
        int sum=0;
//        seperates numbers and add
        while(n>0){
            sum=sum+(n%10)*(n%10);
            n=n/10;
        }
        return sum;
        }
        public static void main(String args[]){
        System.out.println(isHappy(19));
        }
    }

