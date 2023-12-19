package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java">...</a>
 */
public class PigLatin {

    /**
     * Переносит первую букву каждого слова в конец слова и добавляет к результату "ay".
     */
    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String string : strings) {
            char firstChar = string.charAt(0);

            if (Character.isAlphabetic(firstChar)) {
                result.append(string.substring(1))
                        .append(firstChar)
                        .append("ay");
            } else {
                result.append(firstChar);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}
