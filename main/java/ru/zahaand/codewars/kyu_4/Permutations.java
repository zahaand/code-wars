package ru.zahaand.codewars.kyu_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://www.codewars.com/kata/5254ca2719453dcc0b00027d/train/java">...</a>
 */
public class Permutations {

    /**
     * Генерирует все возможные перестановки символов в строке.
     *
     * @param inputString строка, для которой нужно сгенерировать перестановки
     * @return список всех возможных перестановок символов в строке
     */
    public static List<String> singlePermutations(String inputString) {
        List<String> allPermutations = new ArrayList<>();
        generatePermutationsRecursively(inputString.toCharArray(), 0, allPermutations);
        return allPermutations;
    }

    /**
     * Вспомогательный метод для рекурсивного генерирования перестановок.
     *
     * @param characters   массив символов, для которых генерируются перестановки
     * @param currentIndex индекс текущего символа в массиве, который будет переставлен
     * @param permutations список, в который будут добавляться все найденные перестановки
     */
    private static void generatePermutationsRecursively(char[] characters, int currentIndex, List<String> permutations) {
        if (currentIndex == characters.length - 1) {
            permutations.add(new String(characters));
            return;
        }

        Set<Character> visitedCharacters = new HashSet<>();
        for (int i = currentIndex; i < characters.length; i++) {
            if (visitedCharacters.contains(characters[i])) {
                continue;
            }
            visitedCharacters.add(characters[i]);

            swap(characters, currentIndex, i);
            generatePermutationsRecursively(characters, currentIndex + 1, permutations);
            swap(characters, currentIndex, i);
        }
    }

    /**
     * Метод для обмена местами двух символов в массиве.
     *
     * @param characters  массив символов, в котором происходит обмен
     * @param firstIndex  индекс первого символа для обмена
     * @param secondIndex индекс второго символа для обмена
     */
    private static void swap(char[] characters, int firstIndex, int secondIndex) {
        char temp = characters[firstIndex];
        characters[firstIndex] = characters[secondIndex];
        characters[secondIndex] = temp;
    }
}

