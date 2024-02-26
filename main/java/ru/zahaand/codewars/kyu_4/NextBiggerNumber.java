package ru.zahaand.codewars.kyu_4;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/55983863da40caa2c900004e/train/java">...</a>
 */
public class NextBiggerNumber {

    /**
     * Находит следующее большее число, большее заданного числа n.
     * Если следующего большего числа не существует, возвращает -1.
     *
     * @param n Исходное число, для которого нужно найти следующее большее.
     * @return Следующее большее число или -1, если такого числа не существует.
     */
    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();

        // Поиск индекса с конца числа n, где начинается убывающая последовательность чисел
        int lastDescendingIndex = digits.length - 2;
        while (lastDescendingIndex >= 0 && digits[lastDescendingIndex] >= digits[lastDescendingIndex + 1]) {
            lastDescendingIndex--;
        }

        if (lastDescendingIndex < 0) {
            return -1;
        }

        int swapIndex = digits.length - 1;
        while (digits[swapIndex] <= digits[lastDescendingIndex]) {
            swapIndex--;
        }

        char temp = digits[lastDescendingIndex];
        digits[lastDescendingIndex] = digits[swapIndex];
        digits[swapIndex] = temp;

        Arrays.sort(digits, lastDescendingIndex + 1, digits.length);

        return Long.parseLong(String.valueOf(digits));
    }
}
