package ru.zahaand.codewars.kyu_7;

/**
 * <a href="https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java">...</a>
 */
public class Square {

    /**
     * Определяет, является ли заданное число полным квадратом.
     */
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
