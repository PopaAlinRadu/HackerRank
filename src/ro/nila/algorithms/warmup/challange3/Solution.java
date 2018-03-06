package ro.nila.algorithms.warmup.challange3;

import java.util.Scanner;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int alicePoints = 0;
        int bobPoints = 0;
        int[] result = new int[2];
        int[] aliceScore = new int[3];
        aliceScore[0] = a0;
        aliceScore[1] = a1;
        aliceScore[2] = a2;
        int[] bobScore = new int[3];
        bobScore[0] = b0;
        bobScore[1] = b1;
        bobScore[2] = b2;
        for (int i = 0; i < 3; i++) {
            if (aliceScore[i] > bobScore[i]) {
                alicePoints += 1;
                result[0] = alicePoints;
            } else {
                if (aliceScore[i] < bobScore[i]) {
                    bobPoints += 1;
                    result[1] = bobPoints;
                } else {
                    continue;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
}
