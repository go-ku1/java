package leetcode;

import java.util.Arrays;

public class ContainsDuplicate_binarySearch {
// here the tar is an element in the array,the below function is similar to a binary search(array should be sorted)
//    the lowerinsex is the index of first occurance ofthe number and high index is the last occurance of that number
//            in the array.
//    so the no of times an element occurs in an array will be (higher index-lower index+1).
//    if an element occurs only once ,then its  higher index=lower index

        public static int lowerIndexOfNum(int[] nums,int   tar){
            int low=0,high=nums.length-1;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
//                the tar is lower than the nums[mid] and is located at the left half
                if(nums[mid]>=tar){
                    ans=mid;
//                    getting to the left half
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }

    public static int upperIndexOfNum(int[] nums,int   tar){
        int low=0,high=nums.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
//                the tar is greater than the nums[mid] and is located at the right half
            if(nums[mid]<=tar){
                ans=mid;
//                    getting to the right half
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean checkmorethanonce(int nums[]){

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=lowerIndexOfNum(nums,nums[i]);
            int h=upperIndexOfNum(nums,nums[i]);
            if(h-l>0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };


        // Function call
        System.out.println(checkmorethanonce(arr));
    }
}

//we can do this easily by 2 loops-by linear search:
//        for (int i = 0; i < len - 1; i++) {
//          for (int j = i + 1; j < len; j++) {
//              if (arr[i] == arr[j]) {


//we can do by sorting array and comparing adjacent