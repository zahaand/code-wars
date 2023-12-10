package ru.zahaand.codewars.kyu_6;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/514b92a657cdc65150000006/train/java">...</a>
 */
public class Multiples {

    /**
     * Вычисляет сумму всех кратных 3 или 5 ниже заданного числа.
     */
    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(i -> (i % 3 == 0) || (i % 5 == 0))
                .sum();
    }
}
