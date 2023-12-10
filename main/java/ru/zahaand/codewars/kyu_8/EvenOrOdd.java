package ru.zahaand.codewars.kyu_8;

/**
 * <a href="https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java">...</a>
 */
public class EvenOrOdd {

    /**
     * Определяет, является ли число четным или нечетным.
     */
    public static String evenOrOdd(int number) {
        return number % 2 == 0
                ? "Even"
                : "Odd";
    }
}
