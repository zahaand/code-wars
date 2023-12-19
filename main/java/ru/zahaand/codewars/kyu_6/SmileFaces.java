package ru.zahaand.codewars.kyu_6;

import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java">...</a>
 */
public class SmileFaces {

    /**
     * Подсчитывает количество допустимых смайлов в списке строк.
     */
    public static int countSmileys(List<String> arr) {
        return arr.stream()
                .filter(smile -> smile.matches("[:;][-~]?[)D]"))
                .toList()
                .size();
    }
}
