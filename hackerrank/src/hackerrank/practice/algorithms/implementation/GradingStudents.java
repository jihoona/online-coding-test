package hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    /*
    *   https://www.hackerrank.com/challenges/grading/problem
    *
    *   Input: 4
    *          73
    *          67
    *          38
    *          33
    *   Process:
    *   Output: 75
    *           67
    *           40
    *           33
    *
    *   Requirement:
    *
    *   Personal review:
    */

    static int[] solve(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] % 5 < 3 || grades[i] < 38) {
                roundedGrades[i] = grades[i];
            } else {
                roundedGrades[i] = grades[i] + 5 - grades[i] % 5;
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
