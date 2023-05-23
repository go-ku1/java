package leetcode_med;
//this not a brute force solution ,,dont go through whole solution
public class ContainerWithMostWater_pointers {
    public static int maxArea(int[] height) {
//        i moves right,when right h is bigger,itstays,the left h moves by each till left h is bigger
//        ,j moves left,when left h is bigger,it stays,the right h moves by each till right h is bigger
        int i=0,j=height.length-1;
        int area=0;
        while(i<j){
            if(height[i]<=height[j]){
//                height[i] is the height of the smaller wall,so area is height[i]*(j-i)
                area=Math.max(area,height[i]*(j-i));
                i++;
            }
            else{
                area=Math.max(area,height[j]*(j-i));
                j--;
            }
        }
        return area;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
