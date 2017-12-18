package hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    /*
    *   Staircase
    *
    *   Input: 6
    *   Process: Write a program that prints a staircase of size.
    *   Output:
    *                 #
    *                ##
    *               ###
    *              ####
    *             #####
    *            ######
    *
    *   Requirement:
    *
    *   Personal review:
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
