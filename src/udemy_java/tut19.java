package udemy_java;

public class tut19 {
    public static void main(String args[]){
        tut19 obj=new tut19();
        var p=obj.power(3,4);
        System.out.println(p);
    }
    public int power(int x,int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

}
