package ru.zahaand.codewars.kyu_4;

/**
 * <a href="https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java">...</a>
 */
public class StripComments {

    /**
     * Удаляет комментарии из текста.
     *
     * @param text           исходный текст, содержащий комментарии
     * @param commentSymbols массив символов, обозначающих начало комментария
     */
    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder result = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            int lastIndex = line.length();

            for (String commentSymbol : commentSymbols) {
                int commentIndex = line.indexOf(commentSymbol);
                if (commentIndex >= 0 && commentIndex < lastIndex) {
                    lastIndex = commentIndex;
                }
            }

            String strippedLine = line.substring(0, lastIndex).stripTrailing();
            result.append(strippedLine).append("\n");
        }

        if (!result.isEmpty()) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}
