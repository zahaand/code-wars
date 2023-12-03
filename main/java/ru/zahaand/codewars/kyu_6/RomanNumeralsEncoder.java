package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java">...</a>
 */
public class RomanNumeralsEncoder {
    private static final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * Преобразует целое число в строку - римское число.
     */
    public String solution(int n) {
        StringBuilder romanNumeral = new StringBuilder();

        for (int index = 0; index < NUMBERS.length; index++) {
            while (n >= NUMBERS[index]) {
                romanNumeral.append(ROMAN_NUMERALS[index]);
                n -= NUMBERS[index];
            }
        }

        return romanNumeral.toString();
    }
}
