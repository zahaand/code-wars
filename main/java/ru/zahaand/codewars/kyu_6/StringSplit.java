package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java">...</a>
 */
public class StringSplit {

    /**
     * Разбивает строку на массив строк по 2 символа.
     * Если последняя пара содержит только один символ, дополняет ее символом "_"
     */
    public static String[] solution(String s) {
        String[] pairs = s.split("(?<=\\G.{2})");

        if (pairs.length > 0 && pairs[pairs.length - 1].length() == 1) {
            pairs[pairs.length - 1] += "_";
        }

        return pairs;
    }
}
