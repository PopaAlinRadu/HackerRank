package ro.nila.algorithms.warmup.challange6;

import java.util.Scanner;

public class Solution {

    private static int[] countNegativeZeroPositive(int[] arr) {
        int count[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count[0]++;
            } else if (arr[i] == 0) {
                count[1]++;
            } else {
                count[2]++;
            }
        }
        return count;
    }

    static void plusMinus(int[] arr) {
        int[] countNegativeZeroPositive = countNegativeZeroPositive(arr);

        double countNegative = (double) countNegativeZeroPositive[0] / arr.length;
        double countZero = (double) countNegativeZeroPositive[1] / arr.length;
        double countPositive = (double) countNegativeZeroPositive[2] / arr.length;

        System.out.printf("%f%n%f%n%f%n", countPositive, countNegative, countZero);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
