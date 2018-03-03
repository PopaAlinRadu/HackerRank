package ro.nila.java.challange6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i < 11; i++) {
            int result;
            result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
    }
}
