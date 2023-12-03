package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/556deca17c58da83c00002db/train/java">...</a>
 */
public class TribonacciSequence {

    /**
     * Генерирует ряд Трибоначчи до заданной длины.
     */
    public double[] tribonacci(double[] s, int n) {
        if (n <= 0) {
            return new double[0];
        }

        double[] result = Arrays.copyOf(s, n);

        for (int i = s.length; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;
    }
}
