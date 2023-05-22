package leetcode;

public class MoveZeroes_skippingbyloop {
    public static void moveZeroes(int[] nums) {
//        this is so important step...we skipp particular  elments in the array
//        using a second variable which increments only at speific conditions
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
