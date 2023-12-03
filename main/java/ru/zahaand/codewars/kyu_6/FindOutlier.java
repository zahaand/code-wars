package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java">...</a>
 */
public class FindOutlier {

    /**
     * Находит одно четное число в массиве нечетных чисел или одно нечетное число в массиве четных чисел.
     */
    static int find(int[] integers) {
        int even = 0;
        int evenCount = 0;

        int add = 0;
        int addCount = 0;

        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evenCount++;

            } else {
                add = i;
                addCount++;
            }

            if ((evenCount > 1 && addCount == 1)
                    || (evenCount == 1 && addCount > 1)) {
                break;
            }
        }

        return evenCount == 1 ? even : add;
    }
}
