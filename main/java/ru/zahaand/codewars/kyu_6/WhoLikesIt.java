package ru.zahaand.codewars.kyu_6;

/**
 * <a href="https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java">...</a>
 */
public class WhoLikesIt {

    private static final String NO_ONE = "no one likes this";
    private static final String ONE_PERSON = "%s likes this";
    private static final String TWO_PEOPLE = "%s and %s like this";
    private static final String THREE_PEOPLE = "%s, %s and %s like this";
    private static final String FOUR_AND_MORE_PEOPLE = "%s, %s and %d others like this";

    /**
     * Создает строку на основе количества имен, переданных в качестве аргументов.
     */
    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> NO_ONE;
            case 1 -> ONE_PERSON.formatted(names[0]);
            case 2 -> TWO_PEOPLE.formatted(names[0], names[1]);
            case 3 -> THREE_PEOPLE.formatted(names[0], names[1], names[2]);
            default -> FOUR_AND_MORE_PEOPLE.formatted(names[0], names[1], names.length - 2);
        };
    }
}
