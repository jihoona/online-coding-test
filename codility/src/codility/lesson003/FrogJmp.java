package codility.lesson003;

public class FrogJmp {

    /*
    *   FrogJmp
    *
    *   Input: X = 10, Y = 85, D = 30
    *   Process: Find the minimal number of jumps from position X to a position equal to or greater than Y.
    *            - after the third jump, at position 10 + 30 + 30 + 30 = 100
    *   Output: 3
    *
    *   Requirement: Time complexity: O(1), Space complexity: O(1).
    *
    *   Personal review:
    */

    public int solution(int X, int Y, int D) {
        return ((Y - X) % D) != 0 ? ((Y - X) / D) + 1 : ((Y - X) / D);
    }
}
