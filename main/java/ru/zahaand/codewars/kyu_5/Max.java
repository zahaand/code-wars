package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java">...</a>
 */
public class Max {

    /**
     * Находит максимальную сумму подмассива в массиве целых чисел.
     * Максимальная сумма подмассива - сумма элементов подмассива в массиве, которая имеет наибольшее значение.
     * Например, в массиве [1, -2, 3, 4, -1, 2, -5, 4] есть несколько подмассивов, их суммы:
     * [1] - сумма: 1
     * [1, -2] - сумма: -1
     * [1, -2, 3] - сумма: 2
     * [1, -2, 3, 4] - сумма: 5
     * [1, -2, 3, 4, -1] - сумма: 4
     * [1, -2, 3, 4, -1, 2] - сумма: 6
     * [1, -2, 3, 4, -1, 2, -5] - сумма: 1
     * [1, -2, 3, 4, -1, 2, -5, 4] - сумма: 5
     */
    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return Math.max(maxSum, 0);
    }
}
