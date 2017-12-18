package hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    /*
    *   MiniMaxSum
    *
    *   Input: 1 2 3 4 5
    *   Process: Print two space-separated long integers denoting the respective minimum and maximum values
    *            that can be calculated by summing exactly four of the five integers.
    *   Output: 10 14
    *
    *   Requirement:
    *
    *   Personal review:
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = 0;
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = in.nextInt();
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

}
