package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java">...</a>
 */
public class Diamond {

    public static String print(int n) {
        if (n < 1 || n % 2 == 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        int half = n / 2;
        int stars = 1;
        int spaces = half;

        for (int i = 0; i < n; i++) {
            diamond.append(" ".repeat(spaces))
                    .append("*".repeat(stars))
                    .append("\n");

            if (i < half) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }

        return diamond.toString();
    }
}
