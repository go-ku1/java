package leetcode;

import java.util.HashMap;

public class MajorityElement_hashmap {
    public static int majorityElement(int[] nums) {
//        just adding the count of corresponding num to a hashmap
        HashMap<Integer,Integer> hm=new HashMap<>();
        int temp=0;
//        to loop through an array *for(int num:nums)*
        for(int num:nums){
            if(!hm.containsKey(num)){
//                adding anum for the first time
                hm.put(num,1);
            }
            else{
//                increasing the frequency of num
                hm.put(num,hm.get(num)+1);
            }

            if(hm.get(num)>nums.length/2){
                temp=num;
            }
        }
        return temp;
    }
    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
