package leetcode_med;

public class ReverseInteger_whileloop {
    public static int reverse(int x) {
//        here sum is long because we can expect larger values for sum
//                may go outside the integer limits
        long sum=0;
        while(x!=0){
            int k=x%10;
//            multiplying 10 each time to increse a idgit to add k at end
            sum=sum*10+k;
            x=x/10;
        }
//        when outside the integer range=2^31
        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
            return 0;
        }
//        type casting long to intger
        return (int)sum;
    }
    public static  void main(String[] args){
        System.out.println(reverse(321));
    }
}
