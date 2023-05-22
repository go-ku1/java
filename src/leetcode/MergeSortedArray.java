package leetcode;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int nums3[]=new int[m+n];
        //intialising a new array to store
//        the values in asorted order from two arrays directly

        while(i<m && j<n){
//            comparing the elements of the the first and the second array
//                    if the first array elements are smaller ,it is stored in the nums3 array.
//            other wise the second array elements are stored
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i++];

            }
            else{
                nums3[k++]=nums2[j++];

            }
        }
//        the above while case may be terminated if any of the above conditions are not satisfied
//                therefore the remaining elements of the other array is stored in nums3
        while(i<m){
            nums3[k++]=nums1[i++];
        }
        while(j<n){
            nums3[k++]=nums2[j++];
        }

        for(int s=0;s<m+n;s++){
            System.out.println(("ji"));
            nums1[s]=nums3[s];
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
