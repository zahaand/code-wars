package ru.zahaand.codewars.kyu_6;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java">...</a>
 */
public class CreatePhoneNumber {

    /**
     * Создает строку номера телефона из массива целых чисел.
     */
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                IntStream.of(numbers)
                        .boxed()
                        .toArray());
    }
}
