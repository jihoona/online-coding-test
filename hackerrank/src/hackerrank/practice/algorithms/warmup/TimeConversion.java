package hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    /*
    *   TimeConversion
    *
    *   Input: 07:05:45PM
    *   Process: Convert and print the given time in 24-hour format.
    *   Output: 19:05:45
    *
    *   Requirement:
    *
    *   Personal review:
    */

    static String timeConversion(String s) {
        if (s.substring(8).equals("PM")) {
            int hour = Integer.valueOf(s.substring(0, 2)) + 12;
            hour = hour > 23 ? hour - 12 : hour;
            return hour + s.substring(2, 8);
        } else {
            int hour = Integer.valueOf(s.substring(0, 2));
            hour = hour > 11 ? hour - 12 : hour;
            return (hour < 10 ? "0" + hour : hour) + s.substring(2, 8);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
