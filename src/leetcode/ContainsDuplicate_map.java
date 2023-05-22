package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_map {
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> mp=new HashMap<>();
            int freq=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],freq+1);
            if(mp.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }

}
//another way instead of using getOrDefault

//for(int i = 0; i < n; i++){
//        if(map.containsKey(arr[i])){
//        count = map.get(arr[i]);
//        map.put(arr[i], count + 1);
//        }
//        else{
//        map.put(arr[i], 1);
//        }
//        }