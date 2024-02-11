package ru.zahaand.codewars.kyu_4;

/**
 * <a href="https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java">...</a>
 */
public class RangeExtraction {

    /**
     * Форматирует список упорядоченных целых чисел в строку с использованием диапазонов.
     */
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int start = arr[0];
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != end + 1) {
                if (end - start >= 2) {
                    result.append(start).append("-").append(end).append(",");
                } else {
                    result.append(start).append(",");
                    if (end != start) {
                        result.append(end).append(",");
                    }
                }
                start = arr[i];
            }
            end = arr[i];
        }

        if (end - start >= 2) {
            result.append(start).append("-").append(end);
        } else {
            result.append(start).append(",");
            if (end != start) {
                result.append(end);
            }
        }

        if (!result.isEmpty() && result.charAt(result.length() - 1) == ',') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}
