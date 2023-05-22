package udemy_java;

public class tut16_ {
    public static void main(String args[]){
        tut16_ recursion=new tut16_();
        var rec=recursion.fact(4);
        System.out.println(rec);
    }
    public int fact(int n){
        if(n<0){
            return -1;
        }
        if(n==1||n==0){
            return 1;
        }
        return n* fact(n-1); //(n*) is the operation and (fact(n-1)) is the operation after changing n
    }
}
