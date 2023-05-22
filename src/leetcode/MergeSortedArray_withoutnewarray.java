package leetcode;

public class MergeSortedArray_withoutnewarray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        System.out.println("Array after merging");
        for (int b=0; b < m+n; b++)
            System.out.print(nums1[b] + " ");
    }

    public static void main (String[] args)
    {
        int[] arr1 = {1,2,3,0,0,0};


        int[] arr2 = {2,5,6};




        merge(arr1,3,arr2,3);

    }
}
