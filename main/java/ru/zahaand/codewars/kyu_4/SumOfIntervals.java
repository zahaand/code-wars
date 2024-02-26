package ru.zahaand.codewars.kyu_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/52b7ed099cdc285c300001cd/train/java">...</a>
 */
public class SumOfIntervals {

    /**
     * Вычисляет сумму длин интервалов.
     *
     * @param intervals массив двумерных массивов, представляющих интервалы.
     *                  Каждый внутренний массив содержит два элемента: начало и конец интервала.
     * @return сумма длин интервалов
     */
    public static int sumIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedIntervals = new LinkedList<>();
        int[] currentInterval = intervals[0];

        // Объединение перекрывающихся интервалов
        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = interval;
            }
        }
        mergedIntervals.add(currentInterval);

        return mergedIntervals.stream()
                .mapToInt(interval -> interval[1] - interval[0])
                .sum();
    }
}
