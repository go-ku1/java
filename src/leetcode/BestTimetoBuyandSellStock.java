package leetcode;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices){
        int low_p=Integer.MAX_VALUE;
        int old_p=0;
        for(int i=0;i<prices.length;i++){
//            finding lowest no in an array without 2 loops
            if(prices[i]<low_p){
                low_p=prices[i];
            }
            int diff=prices[i]-low_p;
//            finding greatest no in an array without 2 loops
            if(diff>old_p){
                old_p=diff;
            }
        }
        return old_p;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
