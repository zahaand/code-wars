package ru.zahaand.codewars.kyu_5;

import java.math.BigInteger;

/**
 * <a href="https://www.codewars.com/kata/5511b2f550906349a70004e1/train/java">...</a>
 */
public class LastDigitOfLargeNumber {

    /**
     * Возводит n1 в степень n2 и возвращает последнее число результата
     */
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        return n1.modPow(n2, BigInteger.TEN).intValue();
    }
}
