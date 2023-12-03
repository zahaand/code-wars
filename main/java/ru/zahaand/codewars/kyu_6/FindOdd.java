package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">...</a>
 */
public class FindOdd {

    /**
     * Возвращает число, которое встречается в массиве нечетное количество раз.
     * Если применить XOR (исключающее ИЛИ) к двум одинаковым числам, результат будет равен 0.
     * Таким образом одинаковые числа "отменяют" друг друга и не влияют на конечный результат.
     * А если число встречается нечетное количество раз - оно останется в результате.
     */
    public static int findIt(int[] arr) {
        return Arrays.stream(arr)
                .reduce(0, (x, y) -> x ^ y);
    }
}
