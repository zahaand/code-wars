package ru.zahaand.codewars.kyu_4;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java">...</a>
 */
public class Snail {

    /**
     * Возвращает элементы массива, расположенные от внешних элементов к среднему элементу, двигаясь по часовой стрелке
     *
     * @param array - входной массив
     * @return - обход массива по спирали
     */
    public static int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int length = array.length;

        int top = 0;
        int bottom = length - 1;
        int left = 0;
        int right = length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;

                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }

        int[] snailArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            snailArray[i] = result.get(i);
        }

        return snailArray;
    }
}
