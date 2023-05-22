package leetcode;

import java.util.Arrays;

public class MissingNumber_sort {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
