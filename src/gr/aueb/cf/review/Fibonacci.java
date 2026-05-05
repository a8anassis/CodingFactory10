package gr.aueb.cf.review;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int fibo = 1;

        if (n == 0) return a;
        if (n == 1) return b;

        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}
