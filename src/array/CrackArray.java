package array;

import java.util.Arrays;
import java.util.Scanner;

public class CrackArray {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How Many Day's Temperatures?");
//        int days = scanner.nextInt();
//        int[] temps = new int[days];
//        int sum = 0;
//        for (int i = 0; i < days; i++) {
//            System.out.println("Day " + i + " 's high temp");
//            int temp = scanner.nextInt();
//            temps[i] = temp;
//            sum += temp;
//        }
//        double average = sum / days;
//
//        int above = 0;
//        for (int temp : temps) {
//            if (temp > average) {
//                above++;
//            }
//        }
//        System.out.println("Average Temp = " + average);
//        System.out.println(above + " Days Above Average");

//        int[] numbers = {1,2,3,4,6,7,8,9,10};
//        CrackArray crackArray = new CrackArray();
//        crackArray.findMissingArray(numbers);
//
//        int[] pairNumber = crackArray.pairArray(numbers, 5);
//        System.out.println(Arrays.toString(pairNumber));
//
//        crackArray.findNumber(numbers, 3);

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        CrackArray crackArray = new CrackArray();
        crackArray.rotateMatrix(matrix);
    }

    public void findMissingArray(int[] numbers) {
        int sumMissingArray = 0;
        int sumCompleteArray = 10 * (10 + 1) / 2;
        for (int number : numbers) {
            sumMissingArray += number;
        }
        int missing = sumCompleteArray - sumMissingArray;
        System.out.println("Missing Number of Array is: " + missing);
    }

    public int[] pairArray(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {numbers[i], numbers[j]};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }

    public void findNumber(int[] numbers, int number) {
        for (int num : numbers) {
            if (num == number) {
                System.out.println("Number " + number + " is Found");
                return;
            }
        }
        System.out.println("Number is not Found");
    }

    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            }

        }
        return true;

    }
}
