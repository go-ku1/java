package udemy_java;

public class tut21 {
    public static void main(String args[]){
        tut21 obj=new tut21();
        var b=obj.binary(2);
        System.out.println(b);
    }
    public int binary(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return n;
        }
        return n%2+10*binary(n/2);
    }
}
