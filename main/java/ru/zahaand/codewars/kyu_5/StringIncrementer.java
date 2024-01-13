package ru.zahaand.codewars.kyu_5;

import java.math.BigInteger;

/**
 * <a href="https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java">...</a>
 */
public class StringIncrementer {

    /**
     * Увеличивает строку, содержащую число в конце, на 1.
     * Если строка пустая, возвращает "1".
     * Если число отсутствует в конце строки, добавляет "1" в конец строки.
     */
    public static String incrementString(String str) {
        if (str.isEmpty()) {
            return "1";
        }

        String stringPart = str.replaceAll("\\d+$", "");
        String numberPart = str.substring(stringPart.length());

        if (numberPart.isEmpty()) {
            return str + "1";
        }

        BigInteger incrementedNumber = new BigInteger(numberPart)
                .add(BigInteger.ONE);

        String format = "%0" + numberPart.length() + "d";
        String incrementedNumberPart = String.format(format, incrementedNumber);

        return stringPart + incrementedNumberPart;
    }
}
