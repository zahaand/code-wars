package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5264d2b162488dc400000001">...</a>
 */
public class SpinWords {

    /**
     * Разворачивает слова в предложении, длина которых больше или равна 5.
     */
    public String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = sentence.split(" ");

        for (String string : strings) {
            if (string.length() >= 5) {
                string = new StringBuilder(string).reverse().toString();
            }
            stringBuilder.append(string).append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
