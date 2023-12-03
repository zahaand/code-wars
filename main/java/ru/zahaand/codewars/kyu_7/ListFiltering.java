package ru.zahaand.codewars.kyu_7;

import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java">...</a>
 */
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(Integer.class::isInstance)
                .toList();
    }
}
