package ru.zahaand.codewars.kyu_7;

/**
 * <a href="https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java">...</a>
 */
public class XO {

    /**
     * Подсчитывает количество символов 'X' и 'O' в заданной строке.
     */
    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'x') {
                countX++;
            }

            if (ch == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }
}
