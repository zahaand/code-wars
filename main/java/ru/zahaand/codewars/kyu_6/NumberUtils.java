package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java">...</a>
 */
public class NumberUtils {

    /**
     * Проверяет, является ли заданное число Нарциссическим.
     * Нарциссическое число (или Число Армстронга) - это число, которое равно сумме своих цифр,
     * возведенных в степень, равную количеству цифр в числе.
     */
    public static boolean isNarcissistic(int number) {
        String numberStr = String.valueOf(number);
        int narcissisticSum = 0;

        for (char ch: numberStr.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            narcissisticSum += (int) Math.pow(digit, numberStr.length());
        }

        return narcissisticSum == number;
    }
}
