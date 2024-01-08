package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java">...</a>
 */
public class Order {

    /**
     * Упорядочивает заданные слова на основе их числового порядка и возвращает упорядоченные слова в виде строки.
     */
    public static String order(String words) {
        if (words.isBlank()) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        String[] orderedWords = new String[wordsArray.length];

        for (String word : wordsArray) {
            int order = getOrder(word);
            orderedWords[order - 1] = word;
        }

        return String.join(" ", orderedWords);
    }

    /**
     * Извлекает первый символ, являющийся числом, в заданном слове.
     */
    private static int getOrder(String word) {
        return word.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .findFirst()
                .orElse(0);
    }
}
