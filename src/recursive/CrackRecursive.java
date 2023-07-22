package recursive;

public class CrackRecursive {
    public static void main(String[] args) {
        CrackRecursive crackRecursive = new CrackRecursive();
        int sumDigit = crackRecursive.sumOfDigit(231);
        System.out.println("Sum of Digit: " + sumDigit);
        System.out.println("=======================================");
        int power = crackRecursive.power(2, 3);
        System.out.println("Power: " + power);
        System.out.println("=======================================");
        final int fpb = crackRecursive.fpb(8, 12);
        System.out.println("FPB: " + fpb);
        System.out.println("=======================================");
        final int binary = crackRecursive.convertToBinary(10);
        System.out.println("Binary: " + binary);
    }

    public int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + sumOfDigit(n/10);
    }

    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public int fpb (int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return fpb(b, a % b);
    }

    public int convertToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * convertToBinary(n/2);
    }
}
