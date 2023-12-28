package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java">...</a>
 */
public class CountingDuplicates {

    /**
     * Подсчитывает количество повторяющихся символов в заданной строке
     */
    public static int duplicateCount(String text) {
        String lowerCase = text.toLowerCase();

        return (int) lowerCase.chars()
                .filter(ch -> {
                    int indexOf = lowerCase.indexOf(ch);
                    int lastIndexOf = lowerCase.lastIndexOf(ch);

                    return indexOf != lastIndexOf;
                })
                .distinct()
                .count();
    }
}
