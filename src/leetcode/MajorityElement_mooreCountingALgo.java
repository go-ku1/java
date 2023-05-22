package leetcode;

public class MajorityElement_mooreCountingALgo {
    public static int majorityElement(int[] nums) {
        int k=0;
        int count=0;
        for(int num:nums){
//            when for a num ,count becomes zero,it means we must change the num
           if(count==0){
               k=num;
           }
//           when k is not equal to num,means the curr num is lossingits count to other num and other num may
//           have same count as curr num when count reaches zero;
           if(k!=num){
               count--;
           }
//           the count of the curr num goes on increasing
           else {
               count++;
           }
        }
//        so by the end of the loop,which ever num overtakes other in count,will be the most
        return k;
    }
    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
