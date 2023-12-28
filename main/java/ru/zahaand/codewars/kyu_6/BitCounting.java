package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java">...</a>
 */
public class BitCounting {

    /**
     * Получает бинарное (двоичное) представление заданного числа и вычисляет количество бит,
     * установленных в 1
     */
    public static int countBits(int n) {
//        String nBinary = Integer.toBinaryString(n);
//        int count = 0;
//
//        for (char character : nBinary.toCharArray()) {
//            if (character == '1') {
//                count++;
//            }
//        }
//
//        return count;

        return Integer.bitCount(n);
    }
}
