package codility.lesson02;

public class CyclicRotation {

    /*
    *   CyclicRotation
    *
    *   Input: A = [3, 8, 9, 7, 6], K = 3
    *   Process: Rotate array A K times.
    *   Output: [9, 7, 6, 3, 8]
    *
    *   Requirement: Focus on correctness.
    *
    *   Personal review: Have to read the job description in detail.
    */

    public int[] solution(int[] A, int K) {
        int[] array = A;
        int length = array.length;

        int[] output = new int[length];

        for (int i = 0; i < length; i++) {
            output[(K + i) % length] = array[i];
        }

        return output;
    }
}
