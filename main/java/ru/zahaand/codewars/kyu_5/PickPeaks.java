package ru.zahaand.codewars.kyu_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://www.codewars.com/kata/5279f6fe5ab7f447890006a7/train/java">...</a>
 */
public class PickPeaks {

    /**
     * Находит позиции и значения «пиков» (локальных максимумов) в целочисленном массиве.
     *
     * @param arr целочисленный массив
     * @return ассоциативный массив, содержащий список позиций и список значений пиков
     */
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        int length = arr.length;
        int i = 1;
        while (i < length - 1) {
            int before = arr[i - 1];
            int actual = arr[i];
            int after = arr[i + 1];

            if (actual > before && actual > after) {
                pos.add(i);
                peaks.add(actual);
                i++;
            } else if (actual > before && actual == after) {
                int j = i + 1;

                while (j < length - 1 && arr[j] == actual) {
                    j++;
                }

                if (arr[j] < actual) {
                    pos.add(i);
                    peaks.add(actual);
                }

                i = j;

            } else {
                i++;
            }
        }

        result.put("pos", pos);
        result.put("peaks", peaks);

        return result;
    }
}
