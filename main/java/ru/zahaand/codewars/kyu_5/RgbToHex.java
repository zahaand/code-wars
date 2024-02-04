package ru.zahaand.codewars.kyu_5;

/**
 * <a href="https://www.codewars.com/kata/513e08acc600c94f01000001/train/java">...</a>
 */
public class RgbToHex {

    /**
     * Преобразует значения RGB в их шестнадцатеричное представление.
     * Допустимые десятичные значения для RGB находятся в диапазоне от 0 до 255.
     * Любые значения, выходящие за диапазон, округляются до ближайшего допустимого значения.
     *
     * @param r значение красного цвета
     * @param g значение зеленого цвета
     * @param b значение синего цвета
     * @return шестнадцатеричное представление десятичных значений RGB
     */
    public static String rgb(int r, int g, int b) {
        int validR = getValidValue(r);
        int validG = getValidValue(g);
        int validB = getValidValue(b);

        return "%02X%02X%02X".formatted(validR, validG, validB);
    }

    private static int getValidValue(int r) {
        return r > 255 ? 255 : Math.max(r, 0);
    }
}
