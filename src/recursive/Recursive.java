package recursive;

public class Recursive {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        final int factorial = recursive.factorial(3);
        System.out.println(factorial);
    }

    public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
