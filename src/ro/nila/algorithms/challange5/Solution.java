package ro.nila.algorithms.challange5;

import java.util.Scanner;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int diagonalDifference = leftDiagonal(a) - rightDiagonal(a);
        return Math.abs(diagonalDifference);
    }

    private static int leftDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    private static int rightDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][a.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
