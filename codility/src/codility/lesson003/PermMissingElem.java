package codility.lesson003;

public class PermMissingElem {

    /*
    *   PermMissingElem
    *
    *   Input: A = [2, 3, 1, 5]
    *   Process: Find the value of the missing element.
    *   Output: 4
    *
    *   Requirement: Time complexity: O(N), Space complexity is O(1).
    *
    *   Personal review: Perfect!
    */

    public int solution(int[] A) {
        int[] array = A;

        int sumOfValue = 0;
        int expectedSum = 0;
        int count = 1;

        for (int val : array) {
            sumOfValue += val;
            expectedSum += count;
            count++;
        }
        return expectedSum + count - sumOfValue;
    }
}
