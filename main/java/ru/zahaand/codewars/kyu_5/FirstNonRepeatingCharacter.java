package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/train/java">...</a>
 */
public class FirstNonRepeatingCharacter {

    /**
     * Находит первую неповторяющуюся букву в заданной строке.
     *
     * @param s — входная строка
     * @return первую неповторяющуюся букву или пустую строку, если ни одна не найдена
     */
    public static String firstNonRepeatingLetter(String s) {
        return s.chars()
                .mapToObj(i -> (char) i)
                .filter(ch -> isNonRepeatingChar(s, ch))
                .map(String::valueOf)
                .findFirst()
                .orElse("");
    }

    private static boolean isNonRepeatingChar(String s, Character ch) {
        char lowerCaseChar = Character.toLowerCase(ch);
        String lowerCaseString = s.toLowerCase();
        return lowerCaseString.indexOf(lowerCaseChar) == lowerCaseString.lastIndexOf(lowerCaseChar);
    }
}
