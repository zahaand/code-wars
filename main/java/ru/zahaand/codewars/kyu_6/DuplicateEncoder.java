package ru.zahaand.codewars.kyu_6;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java">...</a>
 */
public class DuplicateEncoder {

    /**
     * Кодирует данное слово, заменяя каждый символ на '(', если символ встречается в слове только один раз,
     * и ')', если символ встречается более одного раза.
     */
    public static String encode(String word) {
        String lowercaseWord = word.toLowerCase();
        StringBuilder encodedWord = new StringBuilder();
        Map<Integer, Integer> countByChar = new HashMap<>();

        lowercaseWord.chars()
                .forEach(ch -> {
                    int count = countByChar.getOrDefault(ch, 0);
                    countByChar.put(ch, count + 1);
                });

        lowercaseWord.chars()
                .forEach(ch -> {
                    String encodedChar = countByChar.get(ch) > 1
                            ? ")"
                            : "(";
                    encodedWord.append(encodedChar);
                });

        return encodedWord.toString();
    }
}
