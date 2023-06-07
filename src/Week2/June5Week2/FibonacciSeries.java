package Week2.June5Week2;
/*Given a number N, write a program to
print Fibonacci Series up to the N term.
Input: N = 10
Output: 0 1 1 2 3 5 8 13 21 34 */
public class FibonacciSeries {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }

    }
}