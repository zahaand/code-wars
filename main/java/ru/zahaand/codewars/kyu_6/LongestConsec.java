package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java">...</a>
 */
public class LongestConsec {

    /**
     * Находит самую длинную последовательность при объединении k последующих строк массива строк.
     */
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0
                || k <= 0
                || k > strarr.length) {
            return "";
        }

        String longestConsec = "";
        int maxConsecLength = 0;

        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder consecBuilder = new StringBuilder();

            for (int j = i; j < i + k; j++) {
                consecBuilder.append(strarr[j]);
            }

            String consec = consecBuilder.toString();
            int consecLength = consec.length();
            if (maxConsecLength < consecLength) {
                maxConsecLength = consecLength;
                longestConsec = consec;
            }
        }

        return longestConsec;
    }
}

