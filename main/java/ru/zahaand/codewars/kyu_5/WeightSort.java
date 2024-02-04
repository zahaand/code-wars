package ru.zahaand.codewars.kyu_5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java">...</a>
 */
public class WeightSort {

    /**
     * Сортирует строку чисел по их "весу".
     */
    public static String orderWeight(String str) {
        String[] numbers = str.split("\\s+");

        Arrays.sort(numbers, Comparator.comparing(WeightSort::calculateWeight)
                .thenComparing(Comparator.naturalOrder()));

        return String.join(" ", numbers);
    }

    /**
     * Вычисляет "вес" числа путем суммирования его цифр.
     */
    private static int calculateWeight(String number) {
        return number.chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
