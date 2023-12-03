package ru.zahaand.codewars.kyu_7;

/**
 * <a href="https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java">...</a>
 */
public class ReverseWords {

    /**
     * Инвертирует порядок слов в заданной строке.
     */
    public static String reverseWords(final String original) {
        StringBuilder reversedWords = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (char character : original.toCharArray()) {
            if (character == ' ') {
                if (!currentWord.isEmpty()) {
                    reversedWords.append(currentWord.reverse());
                    currentWord.setLength(0);
                }

                reversedWords.append(character);
            } else {
                currentWord.append(character);
            }
        }

        if (!currentWord.isEmpty()) {
            reversedWords.append(currentWord.reverse());
        }

        return reversedWords.toString();
    }
}
