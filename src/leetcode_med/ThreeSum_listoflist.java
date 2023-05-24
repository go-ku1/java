package leetcode_med;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_listoflist {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> li=new ArrayList<>();
//        the order will be ,-4-1,-1,0,1,2
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);

                    li.add(l);
                    j++;k--;
//                    going forward ,if number is same as previous,skipit
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
//                    going backward,if number is same asprevious(number infront),skip it
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
//                means that the sum is positive and has larger positive number,so to reduce its positive
//                        go bck through the positive elements in the array
                else if(sum>0){
//                    we dont care whether number repeates here,here sumis not 0,so we just need to incrementor decrement
                    k--;
                }
//                here the sum is negative,has higher negative elemnt,so go forward thru the negativ elements
//                        in the array to reduce the negative
                else{
                    j++;
                }
            }
//            i is the base,its with reference to i or keeping i constant that we vary i and j,
//                    so with an i,we compute all possible variation of i and j.
//            now if we incement i and the number is same,then we dont have to calculate the variations for i andnj
//                    as its already been done,so skip that i

//            -4,-1,-1,0,1,2-------->when i=-1, we [-1, -1, 2], [-1, 0, 1] as result
//                    now increment i, then also i=-1, it can return [-1, 0, 1] again..so skip repeating i
            while(i<nums.length-2 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return li;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
