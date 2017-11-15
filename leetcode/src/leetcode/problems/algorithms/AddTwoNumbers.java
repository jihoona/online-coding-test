package leetcode.problems.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    /*
    *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    *   Process: Add the two numbers and return it as a linked list.
    *   Output: 7 -> 0 -> 8
    *
    *   Requirement:
    *
    *   Personal review:
    */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addNextDigit = 0;
        List<Integer> numbers = new ArrayList<>();

        while (l1 != null || l2 != null) {
            int firstNum = 0;
            int secondNum = 0;

            if (l1 != null) {
                firstNum = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                secondNum = l2.val;
                l2 = l2.next;
            }

            int sum = firstNum + secondNum + addNextDigit;
            numbers.add(sum % 10);
            addNextDigit = 0;
            if (sum >= 10) {
                addNextDigit = 1;
            }
        }

        if (addNextDigit > 0) {
            numbers.add(addNextDigit);
        }

        ListNode prevListNode = null;
        for (int i = numbers.size(); i > 0; i--) {
            if (prevListNode == null) {
                prevListNode = new ListNode(numbers.get(i - 1));
            } else {
                ListNode tempListNode = new ListNode(numbers.get(i - 1));
                tempListNode.next = prevListNode;
                prevListNode = tempListNode;
            }
        }
        return prevListNode;
    }

    // Below is the solution. Time complexity: O(max(m,n)), Space complexity: O(max(m,n)).
    // Note that we use a dummy head to simplify the code. Without a dummy head,
    // you would have to write extra conditional statements to initialize the head's value.
    public ListNode addTwoNumbersOptimized(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}