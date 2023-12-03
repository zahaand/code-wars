package ru.zahaand.codewars.kyu_6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://www.codewars.com/kata/59b401e24f98a813f9000026/train/java">...</a>
 */
public class IntegerDepth {

    /**
     * Вычисляет глубину заданного целого числа.
     */
    public int computeDepth(int n) {
        Set<String> digits = new HashSet<>();
        int depth = 0;

        while (digits.size() != 10) {
            depth++;
            int result = n * depth;

            String[] numbers = String.valueOf(result).split("");
            Collections.addAll(digits, numbers);
        }

        return depth;
    }
}
