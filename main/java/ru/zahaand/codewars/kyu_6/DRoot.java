package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/541c8630095125aba6000c00/train/java">...</a>
 */
public class DRoot {

    /**
     * Вычисляет цифровой корень заданного числа - число,
     * полученное путем суммирования цифр данного числа до тех пор,
     * пока не получится однозначное число.
     */
    public static int digital_root(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        if (result >= 10) {
            return digital_root(result);
        }

        return result;
    }
}
