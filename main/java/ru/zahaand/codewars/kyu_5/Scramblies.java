package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java">...</a>
 */
public class Scramblies {

    /**
     * Проверяет, можно ли переставить символы в строке str1 для формирования строки str2
     */
    public static boolean scramble(String str1, String str2) {
        int[] str1CharCounts = new int[26];

        /*
         Коды символов от 'a' до 'z' образуют последовательность от 97 до 122 в таблице Unicode
         Выражение ch - 'a' используется для преобразования символа ch в индекс, начиная с 0
         */
        for (char ch : str1.toCharArray()) {
            str1CharCounts[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            if (str1CharCounts[ch - 'a'] <= 0) {
                return false;
            }
            str1CharCounts[ch - 'a']--;
        }

        return true;
    }
}
