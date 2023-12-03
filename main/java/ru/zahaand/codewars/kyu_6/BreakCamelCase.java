package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5208f99aee097e6552000148/train/java">...</a>
 */
public class BreakCamelCase {

    /**
     * Разбивает строку на слова на основе CamelCase и возвращает отдельные слова, соединенные пробелами.
     */
    public static String camelCase(String input) {
        String[] words = input.split("(?=[A-Z])");
        return String.join(" ", words).trim();
    }
}
