package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/solutions/java">...</a>
 */
public class NumberOfTrailingZeros {

    /**
     * Подсчитывает количество нулей в конце факториала заданного числа.
     * Количество нулей в факториале числа n равно количеству раз, когда число n делится на 5 без остатка.
     *
     * @param n число, для которого вычисляется количество нулей в конце его факториала
     * @return количество нулей в конце факториала числа n
     */
    public static int zeros(int n) {
        int count = 0;

        for (int factor = 5; n / factor >= 1; factor *= 5) {
            count += n / factor;
        }

        return count;
    }
}
