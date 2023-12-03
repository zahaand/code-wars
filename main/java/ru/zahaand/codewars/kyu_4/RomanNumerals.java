package ru.zahaand.codewars.kyu_4;

import java.util.*;

/**
 * <a href="https://www.codewars.com/kata/51b66044bce5799a7f000003/train/java">...</a>
 */
public class RomanNumerals {
    private static final Map<Integer, String> ROMAN_BY_INT = new LinkedHashMap<>();

    static {
        ROMAN_BY_INT.put(1000, "M");
        ROMAN_BY_INT.put(900, "CM");
        ROMAN_BY_INT.put(500, "D");
        ROMAN_BY_INT.put(400, "CD");
        ROMAN_BY_INT.put(100, "C");
        ROMAN_BY_INT.put(90, "XC");
        ROMAN_BY_INT.put(50, "L");
        ROMAN_BY_INT.put(40, "XL");
        ROMAN_BY_INT.put(10, "X");
        ROMAN_BY_INT.put(9, "IX");
        ROMAN_BY_INT.put(5, "V");
        ROMAN_BY_INT.put(4, "IV");
        ROMAN_BY_INT.put(1, "I");
    }

    /**
     * Преобразует целое число в римское число.
     */
    public static String toRoman(int n) {
        StringBuilder romanValue = new StringBuilder();

        for (Map.Entry<Integer, String> entry : ROMAN_BY_INT.entrySet()) {
            int key = entry.getKey();

            while (n >= key) {
                romanValue.append(entry.getValue());
                n -= key;
            }
        }
        return romanValue.toString();
    }

    /**
     * Преобразует римское число в целое число.
     */
    public static int fromRoman(String romanNumeral) {
        int intValue = 0;

        for (Map.Entry<Integer, String> entry : ROMAN_BY_INT.entrySet()) {
            String value = entry.getValue();

            while (romanNumeral.startsWith(value)) {
                intValue += entry.getKey();
                romanNumeral = romanNumeral.substring(value.length());
            }
        }
        return intValue;
    }
}