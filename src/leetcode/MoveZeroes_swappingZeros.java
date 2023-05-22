package leetcode;

public class MoveZeroes_swappingZeros {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i=0; i <nums.length;i++){
            if(nums[i]!=0){
                swap(nums,j,i);
//                j incements only when non zero element and reaches a zero and stops
//                        j stores the index of the zero and swap it with present non zero index i
                j++;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void swap(int[] nums,int j,int i){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}

// eg: 5, 6, 0, 4, 6, 0, 9, 0, 8
//  i=0,j=0,if satisfied,sawps 5 with 5 itself,j=1
//  i=1,j=1,if satisfied,sawps 5 with 5 itself,j=2
//i=2,j=2,if not satisfied,j=2 itself
//i=3,j=2if satisfied,swaps 0 with 4,j=3
//i=4,j=3,if  satisfied,swaps(0 is put to 3th index )with 6,j=4.........
