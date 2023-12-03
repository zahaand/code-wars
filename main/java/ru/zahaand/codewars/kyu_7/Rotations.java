package ru.zahaand.codewars.kyu_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java">...</a>
 */
public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {
        List<String> allRotations = getAllRotations(strng);
        return new HashSet<>(arr).containsAll(allRotations);
    }

    /**
     * Генерирует список всех возможных вращений данной строки.
     */
    private static List<String> getAllRotations(String strng) {
        List<String> allRotations = new ArrayList<>();

        for (int i = 0; i < strng.length(); i++) {
            String rotated = strng.substring(i) + strng.substring(0, i);
            allRotations.add(rotated);
        }

        return allRotations;
    }
}
