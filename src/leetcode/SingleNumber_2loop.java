package leetcode;

public class SingleNumber_2loop {
    public static int singleNumber(int[] nums){
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                if(c==1){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int nums[]={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
