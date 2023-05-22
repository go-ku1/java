package leetcode;
import java.util.List;
import java.util.ArrayList;
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        ArrayList<Integer> row=new ArrayList<Integer>();

        for(int i=0;i<numRows;i++){
//            we are adding 1 as a new elemnet every time we get to new array list
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
//                replace the 1 we added with the required sum
                row.set(j,row.get(j) + row.get(j+1));
            }
//            this is how we add an arrayList as an whole instead of *l.add(row)*
//            row is an object. If we just do l.add(row); and this row object is changed in future operations,
//                    it will affect and changed what it is in our l. So we need to copy it,
//            create a new object, and then save it to l.
                    l.add(new ArrayList<>(row));
        }

    return l;
    }
    public static void main (String[] args){
        System.out.println(generate(5));
    }
}
