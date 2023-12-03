package ru.zahaand.codewars.kyu_4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://www.codewars.com/kata/51e056fe544cf36c410000fb/train/java">...</a>
 */
public class TopWords {

    /**
     * Возвращает список из трех самых часто встречающихся слов в заданной строке.
     */
    public static List<String> top3(String s) {
        String[] words = s.toLowerCase().split("[^a-zA-Z']");

        Map<String, Integer> repetitionCountByWord = new HashMap<>();

        for (String word : words) {
            if (word.matches(".*[a-z\\d].*")) {
                Integer repetitionsCount = repetitionCountByWord.getOrDefault(word, 0);
                repetitionCountByWord.put(word, repetitionsCount + 1);
            }
        }

        return repetitionCountByWord.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}