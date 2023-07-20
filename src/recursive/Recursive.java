package recursive;

public class Recursive {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        final int factorial = recursive.factorial(3);
        System.out.println(factorial);

        final int fibonacci = recursive.fibonacci(4);
        System.out.println("Fibonacci: " + fibonacci);
    }

    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
