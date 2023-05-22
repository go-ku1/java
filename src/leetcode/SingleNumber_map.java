package leetcode;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber_map {
    public static int singleNumber(int[] nums){
        int freq;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<=nums.length-1;i++){
//            this returns the value if there alreday a value for the key,if not,
//            the key is assigned with default value.here a key needs to be assigned when it
//            appears for the first time in an array
            freq=mp.getOrDefault(nums[i],0);
//            increment the value when the key has appeared
            mp.put(nums[i],freq+1);
        }
        for(int j=0;j<=nums.length;j++){
            if(mp.get(nums[j])==1){
                return nums[j];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int nums[]={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
//there is one more method of high and low using binary search
//i will look to it later.go check at gfg single number solutions