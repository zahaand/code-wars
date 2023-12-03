package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/523f5d21c841566fde000009/train/java">...</a>
 */
public class ArrayDiff {

    /**
     * Возвращает массив, содержащий элементы массива «a», которых нет в массиве «b».
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> bSet = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(a)
                .filter(value -> !bSet.contains(value))
                .toArray();
    }
}
