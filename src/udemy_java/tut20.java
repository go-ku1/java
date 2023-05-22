package udemy_java;

public class tut20 {
    public static void main(String args[]){
        tut20 rayappan=new tut20();
        var hcf=rayappan.gcd(12,4);
        System.out.println(hcf);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
