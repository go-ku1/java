package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArray_map {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        we make a hashmap because here when we put each element it is
//        automatically stored in the required ascending order
        Map<Integer,Boolean> mp=new HashMap<>();//*HashMap*
//or        HashMap<Integer,Boolean> mp=new HashMap<>();
        for(int i=0;i<m;i++){
            mp.put(nums1[i],true);
        }
        for(int j=0;j<n;j++){
            mp.put(nums2[j],true);
        }
        int k=0;
        for(Map.Entry<Integer,Boolean> me:mp.entrySet()){
            nums1[k]=me.getKey();
            k++;
        }
        System.out.println("Array after merging");
        for (int b=0; b < m+n; b++)
            System.out.print(nums1[b] + " ");
//        but here repeated elements are not stored twice when we use hashmap
    }
    public static void main (String[] args)
    {
        int[] arr1 = {1,2,3,0,0,0};


        int[] arr2 = {2,5,6};




        merge(arr1,3,arr2,3);

    }
}

