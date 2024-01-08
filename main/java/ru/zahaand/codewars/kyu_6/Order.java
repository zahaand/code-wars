package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java">...</a>
 */
public class Order {

    /**
     * Сортирует слова во входной строке на основе содержащегося числового значения в каждом слове.
     * Слова разделены пробелом и отсортированы в порядке возрастания их числового значения.
     */
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(string -> string.replaceAll("\\D+", "")))
                .collect(Collectors.joining(" "));
    }
}
