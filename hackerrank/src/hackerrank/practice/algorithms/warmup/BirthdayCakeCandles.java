package hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

    /*
    *   BirthdayCakeCandles
    *
    *   Input: 4
    *          3 2 1 3
    *   Process: We have one candle of height 1, one candle of height 2, and two candles of height 3. Colleen only
    *            blows out the tallest candles, meaning the candles where height=3. Because there are such 2 candles,
    *            we print 2 on a new line.
    *   Output: 2
    *
    *   Requirement:
    *
    *   Personal review:
    */

    static int birthdayCakeCandles(int n, int[] ar) {
        int count = 1;
        int max = ar[0];
        for (int i = 1; i < n; i++) {
            if (ar[i] > max) {
                max = ar[i];
                count = 1;
            } else if (ar[i] == max) {
                count++;
            }
        }
        return count;
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
