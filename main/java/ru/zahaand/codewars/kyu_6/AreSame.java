package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/550498447451fbbd7600041c/train/java">...</a>
 */
public class AreSame {

    /**
     * Сравнивает элементы первого массива в квадрате с элементами второго массива.
     */
    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null
                || a.length != b.length) {
            return false;
        }

        int[] squaredA = Arrays.stream(a)
                .map(i -> i * i)
                .sorted()
                .toArray();

        Arrays.sort(b);

        return Arrays.equals(squaredA, b);
    }
}
