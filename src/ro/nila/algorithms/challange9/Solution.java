package ro.nila.algorithms.challange9;

import java.util.Scanner;

public class Solution {

    private static int findTallestCandle(int n, int[] ar) {
        int tallest = ar[0];
        for (int i = 1; i < n; i++) {
            if (ar[i] > tallest) {
                tallest = ar[i];
            }
        }
        return tallest;
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        int tallestCandle = findTallestCandle(n, ar);
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == tallestCandle) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
