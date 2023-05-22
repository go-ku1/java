package udemy_java;

public class tut17_ {
    public static void main(String args[]) {
        tut17_ f = new tut17_();
        var x = f.fib(7);
        System.out.println(x);
    }

    public int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
