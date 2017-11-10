package codility.lesson003;

public class TapeEquilibrium {

    /*
    *   TapeEquilibrium
    *
    *   Input: A = [3, 1, 2, 4, 3]
    *   Process: Find the minimal difference that can be achieved.
    *            - P = 1, difference = |3 − 10| = 7
    *            - P = 2, difference = |4 − 9| = 5
    *            - P = 3, difference = |6 − 7| = 1
    *            - P = 4, difference = |10 − 3| = 7
    *   Output: 1
    *
    *   Requirement: Time complexity: O(N), Space complexity: O(N).
    *
    *   Personal review: O(2N) = O(N)
    */

    public int solution(int[] A) {
        int[] array = A;

        long total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        long min = Long.MAX_VALUE;
        long firstPartSum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            firstPartSum += array[i];
            long diff = (firstPartSum * 2) - total;
            long absDiff = diff > 0 ? diff : -diff;
            min = min > absDiff ? absDiff : min;
        }

        return (int) min;
    }
}
