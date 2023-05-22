package leetcode;

import java.util.HashSet;

public class ContainsDuplicate_hashset {
    public static boolean containsDuplicate(int[] nums) {
//        here hashset may be used because we dont need count of each element lie map.
//                we just check if an elemnet is more than once
        HashSet<Integer> hs=new HashSet<>();
        for(int k=0;k<nums.length;k++){
//          if  .contains is true,the heashset already has that and as already encountered the elment
            if(hs.contains(nums[k])){
                return true;
            }
//            add an element for the first time
            hs.add(nums[k]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };


        // Function call
        System.out.println(containsDuplicate(arr));
    }
}
