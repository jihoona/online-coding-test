package codility.lesson01;

public class BinaryGap {

    /*
    *   Binary Gap
    *
    *   Input: 1041
    *   Process: 1041 -> 10000010001 (binary) -> Count longest binary gap
    *   Output: 5
    *
    *   Input: 20
    *   Process: 20 -> 10100 (binary) -> Count longest binary gap
    *   Output: 1
    *
    *   Requirement: Time complexity: O(logN)
    *
    *   Personal review: Have to read the job description in detail.
    */

    public int solution(int N) {
        int num = N;
        int curLength = 0;
        int maxLength = 0;
        boolean beginGap = false;

        while (num > 0) {
            if (num % 2 == 0 && beginGap) {
                curLength++;
                maxLength = curLength > maxLength ? curLength : maxLength;
            } else if (num % 2 == 1) {
                beginGap = true;
                curLength = 0;
            }
            num /= 2;
        }
        return maxLength;
    }
}