package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions/java?filter=me&sort=best_practice&invalids=false">...</a>
 */
public class ToCamelCase {

    /**
     * Преобразует заданную строку в формате "camelCase".
     */
    static String toCamelCase(String s) {
        StringBuilder builder = new StringBuilder();
        boolean isNextWord = false;

        for (char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                isNextWord = true;
                continue;
            }

            if (isNextWord) {
                builder.append(Character.toUpperCase(ch));
                isNextWord = false;
            } else {
                builder.append(ch);
            }
        }

        return builder.toString();
    }
}
