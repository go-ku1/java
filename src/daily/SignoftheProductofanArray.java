package daily;

public class SignoftheProductofanArray {
    public static int arraySign(int[] nums) {
//        when large products come,try to use double,otherwise weird results can happen
        double pdt=1;
        for(int i=0;i<nums.length;i++){

            pdt=pdt*nums[i];

        }

        if(pdt>0){
            return 1;
        }
        else if(pdt<0){
            return -1;
        }
        return 0;
    }
    public static void main(String args[]){
        int[] nums={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.print(arraySign(nums));
    }
}
