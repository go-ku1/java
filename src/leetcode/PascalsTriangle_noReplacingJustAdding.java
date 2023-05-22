package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_noReplacingJustAdding {
    public static List<List<Integer>> generate(int numRows){
    List<List<Integer>> l=new ArrayList<List<Integer>>();


        for(int i=0;i<numRows;i++){
            ArrayList row=new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    row.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(row);
    }
    return l;
}
    public static void main (String[] args){
        System.out.println(generate(27));
    }

}
