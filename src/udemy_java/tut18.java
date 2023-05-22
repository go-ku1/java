package udemy_java;

public class tut18 {
    public static void main(String args[]){
        tut18 object=new tut18();
        var s=object.sum(4563);
        System.out.println(s);

    }
    public int sum(int n)
    {
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
       return n%10+sum(n/10); //operation=(n%10+),  (same operation by changing n ) =sum(n/10)
    }
}
