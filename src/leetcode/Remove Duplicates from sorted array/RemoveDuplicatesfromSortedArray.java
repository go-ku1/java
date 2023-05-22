package leetcode;

import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;

//        loops from first element to the second last elemnt
//        of the array.the element is only added to nums when it shows a difference
//        from the next element.therefore for the last element,there is no more
//        elements
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }

//        the last element of new nums is the last element;
//        of old nums
            nums[j]=nums[n-1];

            return ++j;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("enter the numbers of the array");
        for(int j=0;j<n;j++){
            num[j]=sc.nextInt();
        }
        System.out.println("the new length of the array is "+removeDuplicates(num));

    }
}
