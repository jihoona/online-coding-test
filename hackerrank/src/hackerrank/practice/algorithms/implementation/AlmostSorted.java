package hackerrank.practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlmostSorted {

    /*
    *   https://www.hackerrank.com/challenges/almost-sorted/problem
    *
    *   https://www.hackerrank.com/challenges/almost-sorted/submissions/code/57552799 참고하여 수정해야 함
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        int[] sortedNumber = numbers.clone();
        Arrays.sort(sortedNumber);

        if (Arrays.equals(numbers, sortedNumber)) {
            System.out.println("yes");
        } else {
            List<Integer> diffIndex = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (numbers[i] != sortedNumber[i]) {
                    diffIndex.add(i);
                }
            }
            if (diffIndex.size() < 2) {
                System.out.println("no");
            } else if (diffIndex.size() == 2) {
                swap(numbers, diffIndex.get(0), diffIndex.get(1));
                if (Arrays.equals(numbers, sortedNumber)) {
                    System.out.println("yes");
                    System.out.println("swap " + (diffIndex.get(0) + 1) + " " + (diffIndex.get(1) + 1));
                } else {
                    System.out.println("no");
                }
            } else if (diffIndex.size() > 2) {

                    if (Arrays.equals(reverse(numbers, diffIndex.get(0), diffIndex.get(diffIndex.size() - 1)), sortedNumber)) {
                        System.out.println("yes");
                        System.out.println("reverse " + (diffIndex.get(0) + 1) + " " + (diffIndex.get(diffIndex.size() - 1) + 1));
                    } else {
                        System.out.println("no");
                    }

            }
        }
    }

    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static int[] reverse(int[] array, int firstIndex, int secondIndex) {
        int[] reverseArray = array.clone();
        for (int i = 0; i < secondIndex - firstIndex + 1; i++) {
            reverseArray[firstIndex + i] = array[secondIndex - i];
        }
        return reverseArray;
    }
}
