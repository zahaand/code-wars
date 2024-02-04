package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/57d5e850bfcdc545870000b7/train/java">...</a>
 */
public class DeadAnts {

    /**
     * Подсчитывает вхождения символов «a», «n» и «t» в заданной строке после удаления всех вхождений строки «ant»
     */
    public static int deadAntCount(final String ants) {

        if (ants == null || ants.isEmpty()) {
            return 0;
        }

        String deadAnts = ants.replace("ant", "");

        int a = 0;
        int n = 0;
        int t = 0;

        for (Character c : deadAnts.toCharArray()) {
            if (c == 'a') {
                a++;
            } else if (c == 'n') {
                n++;
            } else if (c == 't') {
                t++;
            }
        }

        return Math.max(Math.max(a, n), t);
    }
}