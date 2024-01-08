package ru.zahaand.codewars.kyu_6;

import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java">...</a>
 */
public class PersistentBugger {

    /**
     * Рассчитывает постоянство заданного числа.
     */
    public static int persistence(long n) {
        int persistence = 0;

        while (n >= 10) {
            long multiplied = 1;

            while (n > 0) {
                multiplied *= n % 10;
                n /= 10;
            }

            n = multiplied;
            persistence++;
        }

        return persistence;
    }
}
