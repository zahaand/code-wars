package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java">...</a>
 */
public class CamelCaseMethod {

    /**
     * Преобразует заданную строку в CamelCase
     *
     * @param str входная строка, которую нужно преобразовать
     * @return строка, преобразованная в CamelCase
     */
    public static String camelCase(String str) {
        return Arrays.stream(str.split(" "))
                .map(String::trim)
                .filter(string -> !string.isEmpty())
                .map(string -> Character.toUpperCase(string.charAt(0)) + string.substring(1))
                .collect(Collectors.joining());
    }
}
