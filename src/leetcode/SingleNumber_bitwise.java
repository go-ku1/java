package leetcode;

public class SingleNumber_bitwise {
    public static int singleNumber(int[] nums){
        int s=0;
        for(int i=0;i<=nums.length-1;i++){
//            this works on the a^a=0 rule.so all pairs get to zero
//            the single number is left as a^0=a
            s=s^nums[i];
        }
        return s;
    }
    public static void main(String[] args){
        int nums[]={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
