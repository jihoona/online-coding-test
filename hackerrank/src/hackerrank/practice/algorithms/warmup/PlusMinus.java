package hackerrank.practice.algorithms.warmup;

import java.util.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int arr_i = 0; arr_i < n; arr_i++) {
            int num = in.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        in.close();

        System.out.printf("%.06f%n%.06f%n%.06f", positive / n, negative / n, zero / n);
    }
}
