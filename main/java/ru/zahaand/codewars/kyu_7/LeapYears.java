package ru.zahaand.codewars.kyu_7;

/**
 * <a href="https://www.codewars.com/kata/526c7363236867513f0005ca/train/java">...</a>
 */
public class LeapYears {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0
                && (year % 100 != 0 || year % 400 == 0);
    }
}
