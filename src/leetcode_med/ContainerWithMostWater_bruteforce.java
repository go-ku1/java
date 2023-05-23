package leetcode_med;

public class ContainerWithMostWater_bruteforce {
    public static int maxArea(int[] height) {
        int area=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int hgt=Math.min(height[i],height[j]);
                area=Math.max(area,hgt*(j-i));
            }
        }
        return area;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
