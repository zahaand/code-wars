package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/52fb87703c1351ebd200081f/java">...</a>
 */
public class WhatCentury {

    /**
     * Возвращает век с верным суффиксом, соответствующий данному году.
     */
    public static String whatCentury(int year) {
        int century = (year - 1) / 100 + 1;
        String suffix = "th";

        if (century < 4 || century > 20) {
            suffix = switch (century % 10) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        }

        return century + suffix;
    }
}
