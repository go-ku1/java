package leetcode;

public class MissingNumber_noSort {
    public static int missingNumber(int[] nums) {
        int sum=0;
//        taking the sum of present elements
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
//        n*(n+1)/2 represent sum of all natural numbers numbers from 0to n
        return (n*(n+1)/2)-sum;
    }
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
