package ro.nila.algorithms.challange8;

import java.util.Scanner;

public class Solution {
    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int[] minArr(int[] arr) {
        int maxNumber = maxNumber(arr);
        int[] minArr = new int[arr.length];
        double nr = 1;
        for (int j = 0; j < arr.length; j++) {
            nr *= arr[j];

        }
        if (nr == Math.pow(arr[0], arr[0])) {
            for (int k = 0; k < arr.length - 1; k++) {
                minArr[k] = arr[k];
            }
            return minArr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != maxNumber) {
                    minArr[i] = arr[i];
                }
            }
            return minArr;
        }
    }

    private static int[] maxArr(int[] arr) {
        int minNumber = minNumber(arr);
        int[] maxArr = new int[arr.length];
        double nr = 1;

        for (int j = 0; j < arr.length; j++) {
            nr *= arr[j];
        }
        if (nr == Math.pow(arr[0], arr[0])) {
            for (int k = 0; k < arr.length - 1; k++) {
                maxArr[k] = arr[k];
            }
            return maxArr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != minNumber) {
                    maxArr[i] = arr[i];
                }
            }
            return maxArr;
        }
    }


    static void miniMaxSum(int[] arr) {
        int[] minArr = minArr(arr);
        long minSum = 0;
        for (int i = 0; i < minArr.length; i++) {
            minSum += minArr[i];
        }
        int[] maxArr = maxArr(arr);
        long maxSum = 0;
        for (int i = 0; i < maxArr.length; i++) {
            maxSum += maxArr[i];
        }
        System.out.printf("%d %d", minSum, maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();

    }
}
