package codility.lesson002;

import java.util.HashSet;

public class OddOccurrencesInArray {

    /*
    *   OddOccurrencesInArray
    *
    *   Input: [9, 3, 9, 3, 9, 7, 9]
    *   Process: Find the value of the unpaired element.
    *   Output: 7
    *
    *   Requirement: Time complexity: O(N), Space complexity: O(1)
    *
    *   Personal review: HashSet is important! HashSet time and space complexity is O(1).
    */

    public int solution(int[] A) {

        HashSet<Integer> intSet = new HashSet<>();
        int value = 0;

        for (int num : A) {
            if (intSet.add(num)) {
                value += num;
            } else {
                intSet.remove(num);
                value -= num;
            }
        }
        return value;
    }
}
