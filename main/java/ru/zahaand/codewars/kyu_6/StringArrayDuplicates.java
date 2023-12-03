package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/59f08f89a5e129c543000069/train/java">...</a>
 */
public class StringArrayDuplicates {

    /**
     * Удаляет последовательные повторяющиеся символы из каждой строки в данном массиве.
     */
    public static String[] dup(String[] arr) {
        return Arrays.stream(arr)
                .map(string -> string.replaceAll("(.)\\1+", "$1"))
                .toArray(String[]::new);
    }
}
