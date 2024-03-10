package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/51edd51599a189fe7f000015/train/java">...</a>
 */
public class MeanSquareError {

    /**
     * Вычисляет среднеквадратическую разницу между элементами двух целочисленных массивов.
     *
     * @param arr1 первый целочисленный массив
     * @param arr2 второй целочисленный массив
     * @return среднеквадратическую разницу
     */
    public static double solution(int[] arr1, int[] arr2) {
        double sum = 0;
        int numbersCount = arr1.length;

        for (int i = 0; i < numbersCount; i++) {
            sum += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
        }

        return sum / numbersCount;
    }
}
